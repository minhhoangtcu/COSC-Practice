package datastructure.trees.binarysearchtree;

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

	private void print(Node<T> root) {
		System.out.print(root.data + " ");
	}

}
