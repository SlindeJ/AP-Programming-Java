package CS223.Assignment_5;

import java.util.Stack;

public class BST {
	// DO NOT MODIFY
	private Node root;

	public BST() {
		root = null;
	}
	// END DO NOT MODIFY

	public Node search(int key) {
		if (root == null) { return null; }
		Node current = root;
		while (current != null) {
			if (current.value == key) {
				return current;
			} else if (current.value > key) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		return null;
	}

	public Node insert(int key) {
		if (root == null) { root = new Node(key);
		return root;}
		Node current = root;
		Node parent = null;
		while (current != null) {
			if (current.value == key) {
				return null;
			} else if (current.value < key) {
				parent = current;
				current = current.right;
			} else {		// pretty simple logic here
				parent = current;
				current = current.left;
			}
		}
		Node baby = new Node(key);		// cute!
		baby.value = key;
		baby.parent = parent;
		if (parent.value > baby.value) {
			parent.left = baby;
		} else {
			parent.right = baby;
		}
		return baby;
	}

	public boolean remove(int key) {
		Node nodeToEradicate = search(key); 		//E R A D I C A T E
		if (nodeToEradicate == null) { return false; }
		if (nodeToEradicate.left != null && nodeToEradicate.right != null) {
			Node max = findMax(nodeToEradicate.left);		//???
			nodeToEradicate.value = max.value;
			nodeToEradicate = max;
		}
		if (nodeToEradicate.left == null && nodeToEradicate.right == null) {		// if leafNode
			removeLeaf(nodeToEradicate);	// ERADICATE IT
		}
		else {
			removeOneChild(nodeToEradicate); // ERADICATEEEEEEE
		}
		return true;
	}

	private Node findMax(Node node) {
		if (node == null) { return null; }
		while (node.right != null) {
			node = node.right;
		}
		return node;
	}

	private void removeLeaf(Node leaf) {
		if (leaf == root) { root = null; }
		else {
			Node parent = leaf.parent;
			if (leaf == parent.left) {
				parent.left = null;
			} else {
				parent.right = null;
			}
			leaf.parent = null;        // noooooooo, you orphaned the leaf!
		}
	}

	private void removeOneChild(Node node) {	// you monster
		Node child;
		if (node.left != null) {
			child = node.left;
			node.left = null;
		} else {
			child = node.right;
			node.right = null;
		}
		if (node == root) { root = child;
		child.parent = null;
		} else {
			if (node.parent.left == node) {
				node.parent.left = child;
			} else {
				node.parent.right = child;
			}
			child.parent = node.parent;
			node.parent = null;
		}
	}

	// DO NOT MODIFY
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		Node curr = root;
		Stack<Node> stack = new Stack<>();

		while (curr != null || stack.size() > 0) {
			while (curr != null) {
				sb.append(curr);
				sb.append(' ');
				stack.push(curr);
				curr = curr.left;
			}

			curr = stack.pop();
			curr = curr.right;
		}

		return sb.toString();
	}

	public static class Node {
		public int value;
		public Node left, right, parent;

		public Node(int value) {
			this.value = value;
			left = right = parent = null;
		}

		@Override
		public String toString() {
			if (parent == null) {
				return String.format("<%d, null>", value);
			}

			return String.format("<%d, %d>", value, parent.value);
		}
	}
	// END DO NOT MODIFY
}
