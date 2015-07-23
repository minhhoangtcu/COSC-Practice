package stacksAndQueuesPractice;

import java.util.Arrays;

public class Queue {
	
	private int[] queueArray;
	private int queueSize;
	private int front, numberOfItems, rear = 0;
	
	public Queue(int queueSize){
		this.queueSize = queueSize;
		queueArray = new int[queueSize];
		Arrays.fill(queueArray, -1);
	}
	
	public boolean isEmpty() {
		return numberOfItems > 0;
	}
	
	public void insert(int number) {
		if (numberOfItems + 1 < queueSize) { // Check to see if we are trying to insert out of the limit of the queue or not
			queueArray[rear] = number;
			System.out.printf("Inserted %d at the ending to the queue%n", number);
			rear++;
			numberOfItems++;
		}
		else {
			System.out.println("Full queue. Cannot insert");
		}
	}
	
	public int remove() {
		if (!isEmpty()) {
			int output = queueArray[front];
			System.out.printf("Removed %d at the beginning from the queue%n", output);
			queueArray[front] = -1;
			front++;
			numberOfItems--;
			return output;
		}
		else {
			System.out.println("Empty queue. Cannot remove");
			return -1;
		}
	}

}
