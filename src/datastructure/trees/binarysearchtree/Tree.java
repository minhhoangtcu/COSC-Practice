package datastructure.trees.binarysearchtree;

public class Tree<T extends Comparable<T>> {
	
	Node<T> root;
	
	public Tree() {
		root = null;
	}

	public void push(T data) {
		Node<T> newNode = new Node<>(data);
		
		if (isEmpty()) {
			root = newNode;
		}
		else {
			Node<T> current = root, previous = null;
			
			while (current != null) {
				int compare = newNode.data.compareTo(current.data);
				if (compare < 0) {
					previous = current;
					current = current.left;
					if (current == null) {
						previous.left = newNode;
					}
				}
				else if (compare > 0) {
					previous = current;
					current = current.right;
					if (current == null) {
						previous.right = newNode;
					}
				}
				else break; // ignore the case for same node insertion.
			}
		}
	}
	
	public void push(T[] input) {
		for (T each: input) {
			push(each);
		}
	}
	
	public void showInOrder() {
		
	}
	
	public boolean isEmpty() {
		return (root == null);
	}
	
}
