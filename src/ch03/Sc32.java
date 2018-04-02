package ch03;

import edu.colorado.collections.DoubleArraySeq;

public class Sc32 {
	public static void main(String[] args) {
		
	DoubleArraySeq das = new DoubleArraySeq(100);

	for (int i = 0; i<100; i++) {
		das.addAfter(i);
	}
	
	System.out.println(das.getCurrent());
	}
	
}
