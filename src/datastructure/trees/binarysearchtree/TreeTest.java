package datastructure.trees.binarysearchtree;

public class TreeTest {

	public static void main(String[] args) {
		Tree<String> tree = new Tree<>();
		Traversal<String> traversal = new Traversal<>();
		
		String[] input = {"a", "c", "g", "b", "e", "h", "r", "u"};
		tree.push(input);
		System.out.println("Floor of I: " + tree.floor("i"));
		System.out.println("Floor of D: " + tree.floor("d"));
		System.out.println("Floor of F: " + tree.floor("f"));
		System.out.println("Ceil of I: " + tree.ceil("i"));
		System.out.println("Ceil of D: " + tree.ceil("d"));
		System.out.println("Ceil of F: " + tree.ceil("f"));
		System.out.println("Succ of A: " + tree.succ("a"));
		System.out.println("Succ of G: " + tree.succ("g"));
		System.out.println("Succ of H: " + tree.succ("h"));
		System.out.println("Succ of U: " + tree.succ("u"));
		
		System.out.println("Print In-Order");
		traversal.printInOrderRecursively(tree.root);
		System.out.println("\nPrint Pre-Order");
		traversal.printPreORderRecursively(tree.root);
		System.out.println("\nPrint Post-Order");
		traversal.printPostOrderRecursively(tree.root);
	}

}
