package ch12;

public class Select {

	public static void selectionsort(int[] data, int first, int n) {
		int i, j; // Loop control variables
		int big; // Index of largest value in data[first] ... data[first + i]
		int temp; // Used during the swapping of two array values
		for (i = n - 1; i > 0; i--) {
			// Calculate big as the index of the largest value in data[first] ... data[first
			// + i]:
			big = first;
			for (j = first + 1; j <= first + i; j++)
				if (data[big] < data[j])
					big = j;
			// swap data[first + i] with data[big]:
			temp = data[first + i];
			data[first + i] = data[big];
			data[big] = temp;
		}
	}

	public static void selectionsortSmall(int[] data, int first, int n) {
		int i, j;
		int small;
		int temp;
		for (i = 0; i < n - 1; i++) {

			small = i;
			for (j = first + i; j < n; j++)
				if (data[small] > data[j])
					small = j;
			temp = data[first + i];
			data[first + i] = data[small];
			data[small] = temp;
		}
	}

	public static void selectionsortRevert(int[] data, int first, int n) {
		int i, j;
		int small;
		int temp;
		for (i = n - 1; i > 0; i--) {

			small = first;
			for (j = first + 1; j <= first + i; j++)
				if (data[small] > data[j])
					small = j;

			temp = data[first + i];
			data[first + i] = data[small];
			data[small] = temp;
		}
	}

	public static void insertSort(int[] data, int first, int n) {

		for (int i = first +1; i < first + n; i++) {
			int temp = data[i];
			int index = 0;
			for (int j = i-1; j >= first; j--) {
				if (data[j] > temp) {
					data[j+1] = data[j];
				} else {
					index = j+1;
					break;
				}
			}
			data[index] = temp;
		}

	}

	public static void main(String[] args) {
		{
			final String BLANKS = " ";
			int i;
			int[] data = { 80, 10, 50, 70, 60, 90, 20, 30, 40, 0 };
			// // int[] data = {};
			// System.out.println("Here is the original array:");
			// for (i = 0; i < data.length; i++)
			// System.out.print(data[i] + BLANKS);
			// System.out.println();
			//
			// selectionsortRevert(data, 0, data.length);
			// System.out.println("In sorted order, the numbers are:");
			// for (i = 0; i < data.length; i++)
			// System.out.print(data[i] + BLANKS);
			// System.out.println();

			insertSort(data, 0, data.length);
			System.out.println("In sorted order, the numbers are:");
			for (i = 0; i < data.length; i++)
				System.out.print(data[i] + BLANKS);
			System.out.println();
		}
	}
}
