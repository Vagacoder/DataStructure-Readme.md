package ch11;

public class BinarySearch {

	public static int binarySearchIntArray(int[] a, int first, int size, int target) {
		int middle;
		if (size <= 0)
			return -1;
		else {
			middle = first + size / 2;
			if (target == a[middle])
				return middle;
			else if (target < a[middle])
				return binarySearchIntArray(a, first, size / 2, target);
			else
				return binarySearchIntArray(a, middle + 1, (size - 1) / 2, target);
		}
	}
	
	//sc1
	
	public static int linearSearchIntArray(int[] a, int first, int size, int target) {
		for (int i = first; i < size; i++) {
			if (a[i] == target) {
				return i;
			} 
		} 
		return -1;
	}
	
	@SuppressWarnings("rawtypes")
	public static int binarySearchComparableObjArray(Comparable[] a, int first, int size, Comparable target) {
		int middle;
		if (size <= 0)
			return -1;
		else {
			middle = first + size / 2;
			@SuppressWarnings("unchecked")
			int compResult = target.compareTo(a[middle]);
			if (compResult == 0)
				return middle;
			else if (compResult < 0)
				return binarySearchComparableObjArray(a, first, size / 2, target);
			else
				return binarySearchComparableObjArray(a, middle + 1, (size - 1) / 2, target);
		}
	
	}
}
