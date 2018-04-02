package ch08;

import java.util.*;

public class TreeNode {

	public int data;
	public TreeNode left;
	public TreeNode right;


	public TreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}


	public void addNode(int data) {

		TreeNode newNode = new TreeNode(data);

		if (data < this.data) {

			if (this.left == null) {
				this.left = newNode;
			} else {
				this.left.addNode(data);
			}
		} else if (data > this.data) {

			if (this.right == null) {
				this.right = newNode;
			} else {
				this.right.addNode(data);
			}
		}

	}


	public void printDataOfAllNodesBelow() {

		System.out.println(this.data);

		if (left != null) {
			this.left.printDataOfAllNodesBelow();
		}
		if (right != null) {
			this.right.printDataOfAllNodesBelow();
		}

	}


	public void saveSubTreePreorder() {
		Stack<TreeNode> s = new Stack<>();

		TreeNode cur = this;
		while (cur != null) {
			cur.saveNode();
			if (cur.right != null) {
				s.push(cur.right);
			}
			if (cur.left != null) {
				cur = cur.left;
			} else if (s.size() == 0) {
				cur = null;
			} else {
				cur = s.pop();
			}
		}
	}


	public int countNodes() {

		int count = 1;

		if (left != null) {
			count += left.countNodes();
		}

		if (right != null) {
			count += right.countNodes();
		}
		return count;
	}


	public TreeNode findNode(int number) {

		TreeNode result = null;

		if (number == data) {
			return this;
		} else if (number < data && this.left != null) {
			result = left.findNode(number);
		} else if (number > data && this.right != null) {
			result = right.findNode(number);
		}
		return result;
	}


	public Integer[] findRange(double number) {

		Integer[] result = { this.data, this.data };

		if (number == data) {
			return result;
		}

		else if (number < data) {
			if (left != null) {
				result = left.findRange(number);
				if (result[1] < number) {
					result[1] = data;
				}
			} else {
				result = new Integer[] { data, data };
			}

		}

		else if (number > data) {
			if (right != null) {
				result = right.findRange(number);
				if (result[0] > number) {
					result[0] = data;
				}
			} else {
				result = new Integer[] { data, data };
			}

		}

		return result;

	}


	public void saveNode() {

		System.out.println(data);

	}

}