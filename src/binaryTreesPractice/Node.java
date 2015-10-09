package binaryTreesPractice;

public class Node {
	
	Node leftNode, rightNode;
	private int key, count;
	private String data;
	
	public Node(int key, String data) {
		this.key = key;
		this.data = data;
		count = 1;
	}
	
	public String toString() {
		return String.format("key: %d and data: %s", key, data);
	}
	
	public void addCount() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
	
	public int getKey() {
		return key;
	}
}
