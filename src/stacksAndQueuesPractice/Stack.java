package stacksAndQueuesPractice;

import java.util.Arrays;

public class Stack {
	
	int[] stack;
	int topOfStack = -1;
	int stackSize;
	
	public Stack(int stackSize) {
		this.stackSize = stackSize;
		stack = new int[stackSize];
		Arrays.fill(stack, -1); // -1 will represent as empty. We can change this representation later.
	}
	
	public void push(int number) {
		if (topOfStack + 1 < stackSize) { // Check to see if we are trying to push out of the limit of the stack or not
			topOfStack++;
			System.out.printf("Pushed number %d into the top of stack(%d)%n", number, topOfStack);
			stack[topOfStack] = number;
		}
		else {
			System.out.println("The stack is fulled. Unable to push to the top of stack.");
		}
	}
	
	public int pop() {
		if (topOfStack >= 0) { // Check to see if the stack is empty or not
			int output = stack[topOfStack];
			stack[topOfStack] = -1; // Again, -1 will represent as empty.
			System.out.printf("Poped number %d out of the top of stack(%d)%n", output, topOfStack);
			topOfStack--;
			return output;
		}
		else {
			System.out.println("The stack is empty. Unable to pop at the top of stack.");
			return -1;
		}
	}

	public void printAll() {
		if (topOfStack >= 0) {
			System.out.println("********************");
			for (int i = 0; i <= topOfStack; i++) {
				System.out.printf("Index: %d with value: %d%n", i, stack[i]);
			}
			System.out.println("********************");
		}
		else {
			System.out.println("The list is empty, nothing to display.");
		}
		
	}
}
