package ch12;

import java.util.concurrent.*;

public class Concurrency extends RecursiveAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// public final int THRESHOLD = 20000;
	public final int THRESHOLD = 4;
	private int[] data;
	private int first, n;


	public static void main(String[] args) {
		final String BLANKS = " ";
		// int[] data = { 80, 10, 50, 70, 60, 90, 20, 30, 40, 0 };
		// int[] data = {60, 10, 100, 20, 70, 90, 30, 50, 80, 40};
		int[] data = { 40, 20, 10, 80, 60, 50, 7, 30, 100, 90, 70 };
		// int[] data = {};

		// int[] data = { 20, 10 };
		// int[] data = { 40, 50 };
		System.out.println("Here is the original array:");
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i] + BLANKS);
		System.out.println("\n");

		concurrentSort(data, 0, data.length);
		System.out.println("In sorted order, the numbers are:");
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i] + BLANKS);
		System.out.println();

	}


	public static void concurrentSort(int[] data, int first, int size) {
		Concurrency newCon = new Concurrency(data, first, size);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(newCon);
	}


	/**
	 * private constructor
	 * 
	 * @param data
	 * @param first
	 * @param n
	 */
	private Concurrency(int[] data, int first, int size) {
		if (first < 0 || size < 0 || first + size > data.length) {
			throw new ArrayIndexOutOfBoundsException("Bad indexes!");
		}
		this.data = data;
		this.first = first;
		this.n = size;
	}


	@Override
	/**
	 * This method is modified from mergesort() below
	 */
	protected void compute() {
		if (n > THRESHOLD) {
			int n1 = n / 2;
			int n2 = n - n1;
			// Sort the two halves with concurrent recursive calls:
			invokeAll(new Concurrency(data, first, n1), new Concurrency(data, first + n1, n2));
			merge(data, first, n1, n2);
		} else {
			java.util.Arrays.sort(data, first, first + n);
		}
	}


	// mergesort method, which is template for compute method
	public static void mergesort(int[] data, int first, int n) {
		final int THRESHOLD = 20000;
		int n1;
		int n2;
		if (n > THRESHOLD) {
			n1 = n / 2;
			n2 = n - n1;
			mergesort(data, first, n1);
			mergesort(data, first + n1, n2);
			merge(data, first, n1, n2);
		} else {
			java.util.Arrays.sort(data, first, first + n);
		}
	}


	// merge method
	private static void merge(int[] data, int first, int n1, int n2) {
		{
			int[] temp = new int[n1 + n2];
			int copied = 0;
			int copied1 = 0;
			int copied2 = 0;
			int i;

			while ((copied1 < n1) && (copied2 < n2)) {
				if (data[first + copied1] < data[first + n1 + copied2])
					temp[copied++] = data[first + (copied1++)];
				else
					temp[copied++] = data[first + n1 + (copied2++)];
			}

			while (copied1 < n1)
				temp[copied++] = data[first + (copied1++)];

			for (i = 0; i < copied; i++)
				data[first + i] = temp[i];
		}
	}

}
