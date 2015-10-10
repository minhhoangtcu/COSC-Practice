package datastructure.binaryTreesPractice;

public class inOrderTraverseTree {
	
	public static void printAllNodes (Tree tree) {
		Node focusNode = tree.root;
		traverseRecursively(focusNode);
	}
	
	private static void traverseRecursively(Node focusNode) {
		if (focusNode != null) {
			traverseRecursively(focusNode.leftNode);
			System.out.println(focusNode.toString());
			traverseRecursively(focusNode.rightNode);
		}
	}
	
}
