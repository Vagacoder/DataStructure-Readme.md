package ch12;

import java.util.concurrent.RecursiveAction;

public class Concurrency extends RecursiveAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final int THRESHOLD = 20000;
	private int[] data;
	private int first, n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * private constructor
	 * 
	 * @param data
	 * @param first
	 * @param n
	 */
	private Concurrency(int[] data, int first, int n) {
		if (first < 0 || n < 0 || first + n > data.length) {
			throw new ArrayIndexOutOfBoundsException("Bad indexes!");
		}
		this.data = data;
		this.first = first;
		this.n = n;
	}

	@Override
	/**
	 * This method is modified from mergesort() below
	 */
	protected void compute() {
		int n1;
		int n2;
		if (n > THRESHOLD) {
			n1 = n / 2;
			n2 = n - n1;
			// Sort the two halves with concurrent recursive calls:
			invokeAll(new Concurrency(data, first, n1), new Concurrency(data, first + n1, n2));
			merge(data, first, n1, n2);
		} else {
			java.util.Arrays.sort(data, first, first + n);
		}
	}

	// mergesort method
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
