
package ch09;

public class AddTreeTester {

	public static void main(String[] args) {

		// Test the class of TreeNode

		// TreeNode node1 = new TreeNode(4);
		// node1.addNode(2);
		// node1.addNode(1);
		// node1.addNode(0);
		// node1.addNode(3);
		// node1.addNode(6);
		// node1.addNode(5);
		// node1.addNode(7);
		// node1.printDataOfAllNodesBelow();

		// System.out.println();

		AddTree tree = new AddTree();
		Integer[] intArr = new Integer[100];
		for (int i =0; i <100; i++) {
			intArr[i] = i;
		}
		tree.addArray(intArr, 0, 99);
		tree.top.print(0);
//		Integer[] result = tree.findRange(88.5);
//		for(int i:result) {
//			System.out.println(i);
//		}
//		
//		System.out.println();
//		tree.top.findRange1(88.5);

		// tree.addNode(4);
		// tree.addNode(2);
		// tree.addNode(1);
		// tree.addNode(0);
		// tree.addNode(3);
		// tree.addNode(6);
		// tree.addNode(5);
		// tree.addNode(7);

		// tree.printTree();
		// System.out.println();
		//
		// System.out.println(tree.countNodesInTree());
		// System.out.println();
		//
		// System.out.println(tree.findNode(10));
		// System.out.println();
		//
		// System.out.println(tree.findRange(2.5));

		// for (int i : tree.findRange(5.5)) {
		// System.out.println(i);
		// }
		// }

		// tree.saveTreePreorder();
	}
}