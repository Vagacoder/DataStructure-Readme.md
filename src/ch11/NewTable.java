package ch11;

import java.util.*;

public class NewTable<K, E> {

	private Vector<LinkedList<HashPair<K, E>>> table;


	public E put(K key, E element) {

		if (key == null || element == null)
			throw new NullPointerException("key or element is null");

		int i = hash(key);
		LinkedList<HashPair<K, E>> oneList = table.get(i);
		ListIterator<HashPair<K, E>> cursor = oneList.listIterator(0);

		HashPair<K, E> pair;
		E answer;

		while (cursor.hasNext()) {
			pair = cursor.next();
			if (pair.key.equals(key)) {
				answer = pair.element;
				pair.element = element;
				return answer;
			}
		}

		pair = new HashPair<>();
		pair.key = key;
		pair.element = element;
		oneList.add(pair);

		return element;
	}


	@SuppressWarnings("unused")
	public E get(K key) {

		int index = hash(key);
		LinkedList<HashPair<K, E>> ll = table.get(index);
		ListIterator<HashPair<K, E>> temp = ll.listIterator(0);

		while (temp.hasNext()) {

			if (temp != null) {
				return (E) ll.get(temp.nextIndex());
			} else {
				temp = (ListIterator<HashPair<K, E>>) temp.next();
			}
		}
		return null;
	}


	public int hash(K key) {
		return Math.abs(key.hashCode()) % table.size();
	}
}
