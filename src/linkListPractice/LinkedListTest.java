package linkListPractice;

public class LinkedListTest {

	LinkedList list;
	
	public static void main(String[] args) {
		LinkedListTest test = new LinkedListTest();
		test.initData();
		test.list.displayAllNodes();
		//test.list.removeFirstNode();
		//test.list.displayAllNodes();
		//test.list.removeNode("Don Quixote");
		//test.list.displayAllNodes();
		test.list.find("Don Quixote");
		test.list.displayAllNodes();
	}
	
	public void initData() {
		list = new LinkedList();
		list.insertFirstNode("Don Quixote", 315000000, 1605);
		list.insertFirstNode("A Tale Of Two Cities", 200000000, 1859);
		list.insertFirstNode("The Lord of the Rings", 150000000, 1954);
		list.insertFirstNode("The Hobbit", 140600000, 1937);
	}
}
