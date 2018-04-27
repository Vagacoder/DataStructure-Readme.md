package ch12;

public class Heap {

	public static void main(String[] args) {
		final String BLANKS = " ";
		int i;
		// int[] data = { 80, 10, 50, 70, 60, 90, 20, 30, 40, 0 };
		// int[] data = {60, 10, 100, 20, 70, 90, 30, 50, 80, 40};
		int[] data = { 40, 20, 10, 80, 60, 50, 7, 30, 100, 90, 70 };
		// int[] data = {};

		// int[] data = { 20, 10 };
		// int[] data = { 40, 50 };
		System.out.println("Here is the original array:");
		for (i = 0; i < data.length; i++)
			System.out.print(data[i] + BLANKS);
		System.out.println("\n");

		heapsortReverse(data, data.length);
		// makeHeap(data, data.length);

		System.out.println("In sorted order, the numbers are:");
		for (i = 0; i < data.length; i++)
			System.out.print(data[i] + BLANKS);
		System.out.println();
	}

	public static void heapsort(int data[], int n) {
		int unsorted;
		int temp;
		makeHeap(data, n);
		unsorted = n;
		while (unsorted > 1) {
			unsorted--;

			temp = data[0];
			data[0] = data[unsorted];
			data[unsorted] = temp;
			reheapifyDown(data, unsorted);
			// makeHeap(data, unsorted);
		}
	}

	public static void heapsortReverse(int data[], int n) {
		int unsorted;
		makeHeap(data, n);
		unsorted = 0;
		while (unsorted < n) {
			unsorted++;
			makeHeapStartingAtIndex(data, unsorted);

		}
	}

	private static void makeHeap(int[] data, int n) {
		for (int i = 0; i < n; i++) {
			int k = i;
			while (k > 0 && data[k] > data[parent(k)]) {
				int temp = data[k];
				data[k] = data[parent(k)];
				data[parent(k)] = temp;
				k = parent(k);
			}
		}
	}

	private static void reheapifyDown(int[] data, int n) {
		int current = 0;
		int bigChildIndex = 0;
		boolean heapOkay = false;

		while ((!heapOkay) && (leftChild(current) < n)) {

			if (rightChild(current) < n) {
				if (data[leftChild(current)] > data[rightChild(current)]) {
					bigChildIndex = leftChild(current);
				} else {
					bigChildIndex = rightChild(current);
				}
			} else {
				bigChildIndex = leftChild(current);
			}

			if (data[current] < data[bigChildIndex]) {

				int temp = data[current];
				data[current] = data[bigChildIndex];
				data[bigChildIndex] = temp;
				current = bigChildIndex;
			} else {
				heapOkay = true;
			}
		}
	}

	private static void makeHeapStartingAtIndex(int[] data, int startIndex) {
		for (int i = startIndex; i < data.length; i++) {
			int k = i;
			while (k > startIndex && data[k] > data[parent(k - startIndex) + startIndex]) {
				int temp = data[k];
				data[k] = data[parent(k - startIndex) + startIndex];
				data[parent(k - startIndex) + startIndex] = temp;
				k = parent(k - startIndex) + startIndex;
			}
		}

	}

	private static int parent(int k) {
		return (k - 1) / 2;
	}

	private static int leftChild(int k) {
		return 2 * k + 1;
	}

	private static int rightChild(int k) {
		return 2 * k + 2;
	}
}
