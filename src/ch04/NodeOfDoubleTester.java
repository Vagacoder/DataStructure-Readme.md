package ch04;

public class NodeOfDoubleTester {

	public static void main(String[] args) {
		
		NodeOfDouble node1 = new NodeOfDouble(1.1);
		NodeOfDouble node2 = new NodeOfDouble(2.3, node1, null);
		node2.prev = node1;
		node1.next = node2;
		NodeOfDouble head = null;
		
		if (head == null) {
			head.addNodeAfer(42);
		}
		else {head = new NodeOfDouble(42, null, null);
		}
		
		if (head !=null) {
			if (head.next != null) {
				head.next = null;
			}
			else {head = null;}
		}

	}

}
