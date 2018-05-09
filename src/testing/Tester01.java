package testing;

import java.util.ArrayList;

public class Tester01 {

	public static void main(String[] args) {

		// Test directly print array and arraylist
		
		int[] a = { 1, 2, 3, 4 };
		System.out.println(a);
		for (int number : a)
			System.out.println(number);
		
		ArrayList<Integer> b = new ArrayList<>();
		
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		System.out.println(b);
	}

}
