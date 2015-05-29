package linkListPractice;

public class Node {
	
	String bookName;
	int copiesSold;
	int yearOfPublish;
	Node next;
	
	public Node(String book, int copiesSold, int yearOfPublish) {
		this.bookName = book;
		this.copiesSold = copiesSold;
		this.yearOfPublish = yearOfPublish;
	}
	
	public void display() {
		System.out.printf("%s(%d) sold %d of copies%n", bookName, yearOfPublish, copiesSold);
	}
	
	public String toString() {
		return bookName;
	}
}
