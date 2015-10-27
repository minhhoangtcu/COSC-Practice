package datastructure.crackingcode;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(4);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(5);
		Node n7 = new Node(5);
		Node n8 = new Node(5);
		Node n9 = new Node(5);
		Node n10 = new Node(6);
		Node n11 = new Node(7);
		Node n12 = new Node(8);
		Node n13 = new Node(9);
		Node n14 = new Node(9);
		Node n15 = new Node(9);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
		n10.next = n11;
		n11.next = n12;
		n12.next = n13;
		n13.next = n14;
		n14.next = n15;
		n15.next = null;
		removeDuplicates(n1);
	}
	
	public static void removeDuplicates(Node head) {
		Node current = head;
		while (current != null) {
			Node runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else if (runner.next.data > current.data) {
					break;
				} else runner = runner.next;
			}
			current = current.next;
		}
		
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

}
