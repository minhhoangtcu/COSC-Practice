package linkListPractice;

public class DoublyLinkedList {
	
	public Node newest;
	public Node oldest;
	
	/*
	 * Construct a new Doubly Linked List.
	 * In this list, we can go forward and backward. Also, we can insert node both after the last node and before the first node.
	 */
	public DoublyLinkedList() {
		newest = null;
		oldest = null;
	}
	
	public boolean isEmpty() {
		return (newest == null);
	}
	
	/*
	 * Insert a node to the start of the list
	 */
	public void insertFirstNode(String book, int copiesSold, int yearOfPublish) {
		Node newNode = new Node(book, copiesSold, yearOfPublish);

		if (isEmpty()) {
			oldest = newNode;
		}
		else {
			newNode.next = newest;
			newest.previous = newNode;
		}
		
		newest = newNode;
	}
	
	/*
	 * Insert a node to the end of the list
	 */
	public void insertLastNode(String book, int copiesSold, int yearOfPublish) {
		Node newNode = new Node(book, copiesSold, yearOfPublish);
		
		if (isEmpty()) {
			newest = newNode;
		}
		else {
			oldest.next = newNode;
			newNode.previous = oldest; 
		}
		
		oldest = newNode;
	}
	
	/*
	 * Insert a node after a specific node
	 */
	public void insertAfterKey(String book, int copiesSold, int yearOfPublish, String key) {
		if (isEmpty()) {
			System.out.println("The list is empty. Cannot find specified key.");
		}
		else {
			Node newNode = new Node(book, copiesSold, yearOfPublish);
			Node currentNode = newest;
			
			// Find the node with the key
			while (!currentNode.bookName.equals(key)) {
				if (currentNode.next == null) { // Reached the end of the list
					System.out.println("Reached the end of the list, found no match.");
				}
				else {
					currentNode = currentNode.next;
				}
			}
			
			// After finding the node with the key, we have to check if the is in last position or not.
			if (currentNode == oldest) {
				
			}
			
			if (currentNode.bookName.equals(key)) {
					newNode.next = currentNode.next;
					newNode.previous = currentNode;
					currentNode.next.previous = newNode;
					currentNode.next = newNode;
				}
			currentNode = currentNode.next;
		}
	}
	
	public void displayAllNodes() {
		Node current = newest;
		while (current != null) {
			current.display();
			System.out.println("Previous Node: " + current.previous);
			System.out.println("Next Node: " + current.next);
			System.out.println();
			current = current.next;
		}
	}
}
