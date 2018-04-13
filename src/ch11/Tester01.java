package ch11;

import java.util.Arrays;
import java.util.Collections;

public class Tester01 {

	public static void main(String[] args) {
		int[] a = {1, 3, 4, 6, 7, 8, 2, 12,11, 10};
		Arrays.sort(a);
		for (int i :a) {
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(a,7));

	}

}
