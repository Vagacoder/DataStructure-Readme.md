package ch11;

public class BinarySearchTester {

	public static void main(String[] args) {
		
		int[] a = { 2, 4, 6, 8, 10, 12, 14 };
		
		System.out.println(BinarySearch.binarySearchIntArray(a, 0, a.length, 14));
		System.out.println(BinarySearch.linearSearchIntArray(a, 0, a.length, 14));

	}

}
