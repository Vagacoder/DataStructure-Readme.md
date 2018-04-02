package ch02;

import java.util.HashSet;

public class HashsetTester {

	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Jack");
		hs1.add("Peter");
		hs1.add("Arial");
		hs1.add("Bob");
		System.out.println(hs1.size());
		System.out.println(hs1);
		
		for (String str : hs1) {
			System.out.println(str);
		}
	}
		

}
