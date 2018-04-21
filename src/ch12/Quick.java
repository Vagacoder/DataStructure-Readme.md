package ch12;

import java.util.*;

public class Quick {

	public static void main(String[] args) {
		final String BLANKS = " ";
		int i;
		// int[] data = { 80, 10, 50, 70, 60, 90, 20, 30, 40, 0 };
		int[] data = { 40, 20, 10, 80, 60, 50, 7, 30, 100, 90, 70 };
		// int[] data = {};
		System.out.println("Here is the original array:");
		for (i = 0; i < data.length; i++)
			System.out.print(data[i] + BLANKS);
		System.out.println("\n");

		quicksort(data, 0, data.length);
		System.out.println("In sorted order, the numbers are:");
		for (i = 0; i < data.length; i++)
			System.out.print(data[i] + BLANKS);
		System.out.println();
	}


	public static void quicksort(int[] data, int first, int n) {
		int pivotIndex;
		int n1;
		int n2;
		if (n > 1) {
			pivotIndex = partition(data, first, n);
			n1 = pivotIndex - first;
			n2 = n - n1 - 1;
			quicksort(data, first, n1);
			quicksort(data, pivotIndex + 1, n2);
		}
	}


	private static int partition(int[] data, int first, int n) {

		int pivot = data[first];
		int tooBigIndex = first + 1;
		int tooSmallIndex = first + n - 1;

		while (tooBigIndex < tooSmallIndex) {
			while (tooBigIndex < first + n - 1 && data[tooBigIndex] < pivot) {
				tooBigIndex++;
			}
			while (data[tooSmallIndex] > pivot && tooSmallIndex > first) {
				tooSmallIndex--;
			}
			if (tooBigIndex < tooSmallIndex) {
				int temp = data[tooBigIndex];
				data[tooBigIndex] = data[tooSmallIndex];
				data[tooSmallIndex] = temp;
			}

		}

		data[first] = data[tooSmallIndex];
		data[tooSmallIndex] = pivot;

		return tooSmallIndex;

	}
}
