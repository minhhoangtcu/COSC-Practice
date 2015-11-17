package datastructure.trees;

public class Tree {
	
	Node root;
	
	public Tree() {
		root = null;
	}
	
	public void addNode(int key, String data) {
		Node newNode = new Node(key, data);
		
		if (root == null) {
			root = newNode;
		}
		else {
			Node focusNode = root;
			Node parent = null;
			while (true) {
				if (key < focusNode.getKey()) {
					parent = focusNode;
					focusNode = focusNode.leftNode;
					if (focusNode == null) {
						parent.leftNode = newNode;
						return;
					}
					
				}
				else if (key > focusNode.getKey() ) {
					parent = focusNode;
					focusNode = focusNode.rightNode;
					if (focusNode == null) {
						parent.rightNode = newNode;
						return;
					}
				}
				else {
					focusNode.addCount();
					return;
				}
			}
		}
			
	}
	
	
}
