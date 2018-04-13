package ch11;

import java.util.Arrays;

public class ArraySearcher {

	public static void main(String[ ] args) {
		final int[ ] DATA = { 2, 4, 6, 8, 10, 12, 14 };
		final int MINIMUM = -1;
		final int MAXIMUM = 16;
		int target;
		int answer;
		System.out.println("Searching for numbers in an array.");
		for (target = MINIMUM; target <= MAXIMUM; target++)
		{
		answer = Arrays.binarySearch(DATA, 0, DATA.length, target);
		System.out.print("Result searching for " + target + " is ");
		System.out.println("[" + answer + "].");
		}
		System.out.println("End of searching."); }
	
}
