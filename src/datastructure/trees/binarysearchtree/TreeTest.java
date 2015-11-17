package datastructure.trees.binarysearchtree;

public class TreeTest {

	public static void main(String[] args) {
		Tree<String> tree = new Tree<>();
		Traversal<String> traversal = new Traversal<>();
		
		String[] input = {"a", "c", "d", "b", "e"};
		tree.push(input);
		System.out.println("Print In-Order");
		traversal.printInOrderRecursively(tree.root);
		System.out.println("\nPrint Pre-Order");
		traversal.printPreORderRecursively(tree.root);
		System.out.println("\nPrint Post-Order");
		traversal.printPostOrderRecursively(tree.root);
	}

}
