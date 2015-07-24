package linkListPractice;

public class DoublyLinkedList {
	
	public Node newest;
	public Node oldest;
	
	public boolean isEmpty() {
		return (newest == null);
	}
	
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

}
