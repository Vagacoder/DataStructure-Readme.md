
package ch09;

import edu.colorado.nodes.*;

public class TreeTester01 {

	public static void main(String[] args) {

		CharBTNode node1 = new CharBTNode('A', null, null);
		CharBTNode node2 = new CharBTNode('B', null, null);
		CharBTNode node3 = new CharBTNode('C', null, null);
		CharBTNode node4 = new CharBTNode('D', null, null);
		CharBTNode node5 = new CharBTNode('E', null, null);
		CharBTNode node6 = new CharBTNode('F', null, null);
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node1.print(1);
		NodeTypes a1 = NodeTypes.FLOAT;

	}

}
