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
	
	public T predecessor(T data) {
		Node<T> x = predecessor(root, data);
		if (x == null)
			return null;
		else
			return x.data;
	}
	
	private Node<T> predecessor(Node<T> node, T data) {
		if (node == null | isEmpty())
			return null;
		else {
			int comp = data.compareTo(node.data);
			if (comp == 0) // Found a node similar that has the same key with the provided key, so this must be the predecessor
				return node;
			else if (comp < 0)
				return predecessor(node.left, data); // If the node key is less than the key, then the predecessor must be on the left
			else {
				Node<T> right = predecessor(node.right, data); // If the node key is more than the key, the the predecessor may be on the right. 
															   // If there is one, return it. If not, return the parent.
				if (right != null) 
					return right;
				else
					return node;
			}
		}
	}
	
	public Node successor() {
		return null;
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
