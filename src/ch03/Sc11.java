package ch03;

public class Sc11 {
	
	public int[] copyElements(int[] arr1, int[] arr2, int n) {
		int totalLength = arr1.length + arr2.length;
		int[] result = new int[totalLength];
		for (int i = 0; i<arr1.length; i++) {
			result[i] = arr1[i];
		}
		for (int i= 0; i<arr2.length; i++) {
			result[arr1.length+i] = arr2[i];
		}
		
		return result;
	}

}
