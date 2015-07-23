package stacksAndQueuesPractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void test() {
		int stackSize = 5;
		Stack stack = new Stack(stackSize);
		stack.push(5);
		assertEquals(5, stack.pop());
		stack.push(6);
		stack.push(8);
		stack.push(3);
		stack.push(4);
		stack.push(1);
		stack.push(1);
		stack.printAll();
		assertEquals(1, stack.pop());
		stack.printAll();
	}

}
