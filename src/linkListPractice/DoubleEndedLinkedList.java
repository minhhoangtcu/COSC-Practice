package linkListPractice;

public class DoubleEndedLinkedList {
	
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
		
		newNode.next = newest;
		newest = newNode;
	}

}
