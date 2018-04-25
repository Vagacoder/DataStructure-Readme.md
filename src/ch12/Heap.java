package ch12;

public class Heap {

	public static void main(String[] args) {
		final String BLANKS = " ";
		int i;
		// int[] data = { 80, 10, 50, 70, 60, 90, 20, 30, 40, 0 };
		// int[] data = {60, 10, 100, 20, 70, 90, 30, 50, 80, 40};
		// int[] data = { 40, 20, 10, 80, 60, 50, 7, 30, 100, 90, 70 };
		// int[] data = {};

		// int[] data = { 20, 10 };
		int[] data = { 40, 50 };
		System.out.println("Here is the original array:");
		for (i = 0; i < data.length; i++)
			System.out.print(data[i] + BLANKS);
		System.out.println("\n");

		heapsort(data, data.length);
		System.out.println("In sorted order, the numbers are:");
		for (i = 0; i < data.length; i++)
			System.out.print(data[i] + BLANKS);
		System.out.println();
	}

	public static void heapsort(int data[], int n) {
		int unsorted; // Size of the unsorted part of the array
		int temp; // Used during the swapping of two array locations
		makeHeap(data, n);
		unsorted = n;
		while (unsorted > 1) {
			unsorted--;
			// Swap the largest element (data[0]) with the final element of unsorted part
			temp = data[0];
			data[0] = data[unsorted];
			data[unsorted] = temp;
			reheapifyDown(data, unsorted);
		}
	}

	private static void makeHeap(int[] data, int n) {
		for (int i = 1; i < n; i++) {
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
		int current = 0; // Index of the node that’s moving down
		int bigChildIndex =0; // Index of current’s larger child
		boolean heapOkay= false; // Will become true when heap is correct

		while ((!heapOkay) && (leftChild(current)<data.length))
		{
//		Set bigChildIndex to be the index of the larger child of the current
//		node. (If there is only one child, then bigChildIndex will be set to
//		the index of this one child.)
		if (data[current] < data[bigChildIndex])
		{
		//Swap data[current] with data[bigChildIndex].
		current = bigChildIndex;
		}
		else
		heapOkay = true;
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
