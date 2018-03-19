package ch08;

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
		Integer[] intArr = { 0, 1, 2, 3, 4, 5, 6, 7 };
		tree.addArray(intArr, 0, 7);
		
		// tree.addNode(4);
		// tree.addNode(2);
		// tree.addNode(1);
		// tree.addNode(0);
		// tree.addNode(3);
		// tree.addNode(6);
		// tree.addNode(5);
		// tree.addNode(7);
		
		tree.printTree();
		System.out.println();
		
//		System.out.println(tree.countNodesInTree());
//		System.out.println();
//		
//		System.out.println(tree.findNode(10));
//		System.out.println();
//		
//		System.out.println(tree.findRange(2.5));
		
		for (int i : tree.findRange(2.5)) {
			System.out.println(i);
		}
		
	}

}
