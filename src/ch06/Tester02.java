package ch06;

import java.util.*;

public class Tester02 {

	public static void main(String[] args) {

		Stack<Integer> sInt = new Stack<>();

		sInt.push(10);
		sInt.push(19);
		sInt.push(28);
		sInt.remove(0);
		sInt.insertElementAt(100, 0);
		System.out.println(sInt.capacity());
		System.out.println(sInt.isEmpty());
		System.out.println(sInt.size());
		System.out.println(sInt.get(1));
		System.out.println(sInt.firstElement());
		System.out.println(sInt.pop());
		System.out.println(sInt.size());
		System.out.println(sInt.get(0));

	}

}
