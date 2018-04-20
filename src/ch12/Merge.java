package ch12;

public class Merge {

	public static void main(String[] args) {
		final String BLANKS = " ";
		int i;
		int[] data1 = { 80, 10, 50, 70, 60, 90, 20, 30, 40, 0 };
		int[] data = {   20,10, 30,50,  40,60, 90,80,  70, 0 };
		// int[] data = {};
		System.out.println("Here is the original array:");
		for (i = 0; i < data.length; i++)
			System.out.print(data[i] + BLANKS);
		System.out.println("\n");

		mergesort(data, 0, data.length);
		System.out.println("In sorted order, the numbers are:");
		for (i = 0; i < data.length; i++)
			System.out.print(data[i] + BLANKS);
		System.out.println();

	}

	public static void mergesort(int data[], int first, int n) {
		int numberOf1half;
		int numberOf2half;
		if (n > 1) {
			numberOf1half = n / 2;
			numberOf2half = n - numberOf1half;
			mergesort(data, first, numberOf1half);
			mergesort(data, first + numberOf1half, numberOf2half);

			merge(data, first, numberOf1half, numberOf2half);
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
