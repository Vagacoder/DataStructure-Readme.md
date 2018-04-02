package ch04;

import java.util.*;

public class Tester01 {

	public static void main(String[] args) {

		LinkedList<Integer> ll1 = new LinkedList<>();
		System.out.println(ll1.isEmpty());

		ll1.add(1);
		ll1.add(8);
		ll1.add(14);
		ll1.push(20);
		ll1.remove();

		System.out.println(ll1.get(1));
		System.out.println(ll1.get(3));
		System.out.println(ll1.pop());

		StringBuilder str = new StringBuilder("abcd");
		str.insert(0, 0);
		System.out.println(str);

	}

}
