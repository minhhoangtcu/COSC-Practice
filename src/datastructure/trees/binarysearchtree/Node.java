package datastructure.trees.binarysearchtree;

public class Node<T extends Comparable<T>> {
	
	T data;
	Node<T> left, right;
	
	public Node(T data) {
		this.data = data;
	}
}
