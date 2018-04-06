package ch09;

import java.util.*;

public class AddTree {

	public TreeNode top;


	public void addNode(int number) {
		TreeNode newNode = new TreeNode(number);
		TreeNode current = top;
		if (current == null) {
			top = newNode;
		} else {
			top.addNode(number);
		}
	}


	public void addArray(Integer[] input, int startIndex, int endIndex) {
		int middleIndex = (startIndex + endIndex + 1) / 2;
		this.addNode(input[middleIndex]);
		if (startIndex < endIndex) {
			this.addArray(input, startIndex, middleIndex - 1);
			if (middleIndex < endIndex) {
				this.addArray(input, middleIndex + 1, endIndex);
			}
		}
	}


	public void printTree() {
		top.printDataOfAllNodesBelow();
	}


	public int countNodesInTree() {
		return top.countNodes();
	}


	public TreeNode findNode(int number) {
		return top.findNode(number);
	}


	public Integer[] findRange(double number) {
		return top.findRange1(number);
	}


	public void saveTreePreorder() {
		top.saveSubTreePreorder();
	}
}
