package ch12;

public class Insert {
	public static void main(String[] args) {

		final String BLANKS = " ";
		int i;
		int[] data = { 80, 10, 50, 70, 60, 90, 20, 30, 40, 0 };
		// int[] data = {};
		System.out.println("Here is the original array:");
		for (i = 0; i < data.length; i++)
			System.out.print(data[i] + BLANKS);
		System.out.println("\n");

		insertSort(data, 0, data.length);
		System.out.println("In sorted order, the numbers are:");
		for (i = 0; i < data.length; i++)
			System.out.print(data[i] + BLANKS);
		System.out.println();

	}
	
	public static void insertSort(int[] data, int first, int n) {
		for (int i = first +1; i< first +n; i++ ) {
			int index = first;
			int tempValue = data[i];
			
			for (int j = i-1; j >= first; j-- ) {
				if (tempValue < data[j]) {
					data[j+1] = data[j];
				} else {index = j + 1; break;}	
			}
			data[index] = tempValue;
		}
	}
}
