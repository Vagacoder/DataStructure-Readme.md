package ch06;

import java.util.*;

public class Tester01 {

	public static void main(String[] args) {
		Scanner in = new Scanner("This is a testing12 sent34ence.");
		String next = in.findInLine("1");
		System.out.println(next);
		System.out.println();
		in.close();

		Integer[] arr1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		int i = 2;
		System.out.println(arr1[i]);
		System.out.println(arr1[i++]);
		System.out.println(arr1[i++]);
		System.out.println(i);
		System.out.println();

		i = 2;

		System.out.println(i);
		System.out.println(+i);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i);

	}

}
