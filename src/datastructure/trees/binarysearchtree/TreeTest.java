package datastructure.trees.binarysearchtree;

public class TreeTest {

	public static void main(String[] args) {
		Tree<String> tree = new Tree<>();
		Traversal<String> traversal = new Traversal<>();
		
		String[] input = {"a", "c", "g", "b", "e", "h", "r", "u"};
		tree.push(input);
		System.out.println("Pred of C: " + tree.predecessor("i"));
		System.out.println("Pred of D: " + tree.predecessor("d"));
		System.out.println("Pred of F: " + tree.predecessor("f"));
		
		System.out.println("Print In-Order");
		traversal.printInOrderRecursively(tree.root);
		System.out.println("\nPrint Pre-Order");
		traversal.printPreORderRecursively(tree.root);
		System.out.println("\nPrint Post-Order");
		traversal.printPostOrderRecursively(tree.root);
	}

}
