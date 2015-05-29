package linkListPractice;

public class LinkedList {
	
	public Node newest;
	
	public LinkedList() {
		newest = null;
	}
	
	public boolean isEmpty() {
		return (newest == null);
	}

	public void insertFirstNode(String book, int copiesSold, int yearOfPublish) {
		Node newNode = new Node(book, copiesSold, yearOfPublish);
		newNode.next = newest;
		newest = newNode;
	}
	
	public void insertFirstNode(Node node) {
		node.next = newest;
		newest = node;
	}
	
	public Node removeFirstNode() {
		Node removedNode = newest;
		if (isEmpty()) {
			System.out.println("Empty list, cannot remove");
		}
		else {
			newest = newest.next;
			System.out.println("Removed First Node \n");
		}
		return removedNode;
	}

	public void displayAllNodes() {
		System.out.println("*******************************");
		Node currentNode = newest;
		while (currentNode != null) {
			currentNode.display();
			System.out.println("Next node: " + currentNode.next + "\n");
			currentNode = currentNode.next;
		}
		System.out.println("Reached end of the list \n");
		System.out.println("*******************************");
	}
	
	public Node removeNode(String name) {
		Node currentNode = newest;
		if (currentNode.bookName == name) {
			newest = currentNode.next;
			System.out.println("Removed Node named " + currentNode + "\n");
			return currentNode;
		}
		
		Node previousNode = null;
		while (!currentNode.bookName.equals(name)) {
			if (currentNode.next != null) {
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			else {
				System.out.println("Reached end of the list, cannot find node " + name + " to remove");
				return null;
			}
		}
		previousNode.next = currentNode.next;
		System.out.println("Removed Node named " + currentNode + "\n");
		return currentNode;
	}
	
}
