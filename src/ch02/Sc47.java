package ch02;

import java.util.HashSet;
import java.util.Iterator;



public class Sc47 {
	
	public static int averageStringLength(HashSet<String> hashset) {
		
		if (hashset.size() == 0) {
			throw new IllegalArgumentException("HashSet is empty!"); 
		}
		
		int totalLength = 0;
		Iterator<String> it = hashset.iterator();
		while (it.hasNext()) {
			totalLength += it.next().length();
		}
		
		return totalLength/hashset.size();
	}

	public static void main(String[] args) {
		HashSet<String> h1 = new HashSet<>();
		h1.add("We");
		h1.add("You");
		h1.add("unbelievable");
		h1.add( "Mission");
		h1.add("essential");
		
		System.out.println(averageStringLength(h1));
	}

}
