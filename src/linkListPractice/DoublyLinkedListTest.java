package linkListPractice;

public class DoublyLinkedListTest {
	
	DoublyLinkedList list;
	
	public static void main(String[] args) {
		DoublyLinkedListTest test = new DoublyLinkedListTest();
		test.initData();
		test.list.displayAllNodes();
	}

	public void initData() {
		list = new DoublyLinkedList();
		list.insertFirstNode("Don Quixote", 315000000, 1605);
		list.insertFirstNode("A Tale Of Two Cities", 200000000, 1859);
		list.insertFirstNode("The Lord of the Rings", 150000000, 1954);
		list.insertLastNode("A Game of Ice and Fire", 50000000, 1995);
		list.insertFirstNode("The Hobbit", 140600000, 1937);
		list.insertAfterKey("English-Vietnamese Dictionary", 5000000, 1905, "A Tale Of Two Cities");
	}
}
