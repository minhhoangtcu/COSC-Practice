package datastructure.binaryTreesPractice;

public class Test {

	@org.junit.Test
	public void inOrderTraverse() throws InterruptedException {
		Tree tree = initializeTree();
		inOrderTraverseTree.printAllNodes(tree);
		Thread.sleep(60000);
	}
	
	private static Tree initializeTree() {
		Tree tree = new Tree();
		tree.addNode(146340, "Dentist");
		tree.addNode(90000, "Nurse Practitioner");
		tree.addNode(100000, "Software Developer");
		tree.addNode(123300, "Physician");
		tree.addNode(71110, "Dental Hygienist");
		tree.addNode(80000, "Physical Therapist");
		tree.addNode(70000, "Computer Systems Analyst");
		return tree;
	}

}
