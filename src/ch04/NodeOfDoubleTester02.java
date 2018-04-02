package ch04;

public class NodeOfDoubleTester02 {

	public static void main(String[] args) {

		NodeOfDouble head = null;
		NodeOfDouble tail = null;
		NodeOfDouble node1 = new NodeOfDouble(1);
		head = node1;
		tail = node1;
		
		for (int i = 1; i<100;i++) {
			NodeOfDouble newNode = new NodeOfDouble (i+1);
			newNode.prev =tail;
			tail.next = newNode;
			tail = newNode;
		}

//		NodeOfDouble tempNode = head;
//		while (tempNode != null) {
//			System.out.println(tempNode.getData());
//			tempNode = tempNode.next;
//		}
		
		NodeOfDouble tempNode1;
		for (tempNode1 = head; tempNode1 != null; tempNode1 = tempNode1.next) {
			System.out.println(tempNode1.getData());
		}
		
		tempNode1 = head;
		
		for (int i = 1; (i<110) && (tempNode1 !=null); i++) {
			tempNode1 = tempNode1.next;
		}
		System.out.println(tempNode1 == null);

	}

}
