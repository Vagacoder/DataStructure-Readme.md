package ch12;

public class Select {
	public static void main(String[] args) {

		final String BLANKS = " ";
		int i;
		int[] data = { 80, 10, 50, 70, 60, 90, 20, 30, 40, 0 };
		// int[] data = {};
		System.out.println("Here is the original array:");
		for (i = 0; i < data.length; i++)
			System.out.print(data[i] + BLANKS);
		System.out.println("\n");

		selectionsortReverse(data, 0, data.length);
		System.out.println("In sorted order, the numbers are:");
		for (i = 0; i < data.length; i++)
			System.out.print(data[i] + BLANKS);
		System.out.println();

	}
	
	/**
	 * SelectionSort, insert largest to end
	 * @param data
	 * @param first
	 * @param n
	 */

	public static void selectionsort(int[] data, int first, int n) {
		int i, j; 
		int indexOfBig; 
		
		for (i = n - 1; i > 0; i--) {
			indexOfBig = first;
			
			for (j = first + 1; j <= first + i; j++) {
				if (data[indexOfBig] < data[j]) {
					indexOfBig = j;
				}
			}

			int tempValue = data[first + i];
			data[first + i] = data[indexOfBig];
			data[indexOfBig] = tempValue;
		}
	}
	
	/**
	 * SelectSort, insert smallest to beginning.
	 * @param data
	 * @param first
	 * @param n
	 */
	public static void selectionsort1(int[] data, int first, int n) {
		
		for (int i = 0; i < n; i ++) {
			int indexOfSmall = first + i;
			for (int j = i +1; j < n; j++) {
				if (data[first + j] < data[indexOfSmall]) {
					indexOfSmall = first + j;
				}
			}
			int tempValue = data[first + i];
			data[first + i] = data[indexOfSmall];
			data[indexOfSmall] = tempValue;
		}
		
	}

	public static void selectionsortReverse(int[] data, int first, int n) {
		for (int i = first + n-1; i >=first; i--) {
			int indexOfSmall = first;
			for (int j = first; j <= i; j++) {
				if (data[j] < data[indexOfSmall]) {
					indexOfSmall = j;
				}
			}
			int tempValue = data[first + i];
			data[first+i] = data[indexOfSmall];
			data[indexOfSmall] = tempValue;
		}
	}


}
