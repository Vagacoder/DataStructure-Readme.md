package ch12;

public class Quick {

	public static void main(String[] args) {

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

	}
}
