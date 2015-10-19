package datastructure.stacksAndQueuesPractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class DerekBanasStackTest {

	@Test
	public void test() {
		int stackSize = 5;
		DerekBanasStack stack = new DerekBanasStack(stackSize);
		stack.push(5);
		assertEquals(5, stack.pop());
		stack.push(6);
		stack.push(8);
		stack.push(3);
		stack.push(4);
		stack.push(1);
		stack.push(8); // will be full
		assertEquals(1, stack.peek());
		stack.printAll();
		assertEquals(1, stack.pop());
		assertEquals(4, stack.pop());
		assertEquals(3, stack.pop());
		assertEquals(8, stack.pop());
		assertEquals(6, stack.pop());
		assertEquals(-1, stack.pop()); // Empty
		stack.printAll();
	}

}
