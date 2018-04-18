package ch12;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void mergesort(int data[], int first, int n) {
		int n1;
		int n2;
		if (n > 1) {
			n1 = n / 2;
			n2 = n - n1;
			mergesort(data, first, n1); 
			mergesort(data, first + n1, n2); 

			merge(data, first, n1, n2);
		}
	}

	private static void merge(int[] data, int first, int n1, int n2) {
		// TODO Auto-generated method stub
		
	}
}
