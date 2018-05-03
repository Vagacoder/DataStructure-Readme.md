package testing;

import java.util.ArrayList;

public class Tester02 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		String[] arr1 = new String[10]; 
		arr1 = list1.toArray(arr1);
		System.out.println(list1);
		System.out.println(arr1);
		for(String str: arr1) {
			System.out.println(str);
		}
	}

}
