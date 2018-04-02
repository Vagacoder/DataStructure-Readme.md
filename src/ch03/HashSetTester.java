package ch03;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTester {

	public static void main(String[] args) {
		HashSet<Integer> hs1 = new HashSet<>();
		hs1.add(2);
		hs1.add(4);
		hs1.add(8);
		System.out.println(hs1);
		Iterator<Integer> iter = hs1.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		

	}

}
