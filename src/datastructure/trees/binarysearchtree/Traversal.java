package datastructure.trees.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal<T extends Comparable<T>> {
	
	public void printInOrderRecursively(Node<T> root) {
		if (root != null) {
			printInOrderRecursively(root.left);
			print(root);
			printInOrderRecursively(root.right);
		}
	}
	
	public void printPreORderRecursively(Node<T> root) {
		if (root != null) {
			print(root);
			printPreORderRecursively(root.left);
			printPreORderRecursively(root.right);
		}
	}
	
	public void printPostOrderRecursively(Node<T> root) {
		if (root != null) {
			printPostOrderRecursively(root.left);
			printPostOrderRecursively(root.right);
			print(root);
		}
	}
	
	public void printLevelOrderIteratively(Node<T> root) {
		Queue<Node<T>> queue = new LinkedList<>();
		Node<T> current = root;
		while (true) {
			print(current);
			if (current.left != null)
				queue.add(current.left);
			if (current.right != null)
				queue.add(current.right);
			if (!queue.isEmpty())
				current = queue.remove();
			else
				break;
		}
		
	}

	private void print(Node<T> root) {
		System.out.print(root.data + " ");
	}

}
