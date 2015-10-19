package datastructure.stacksAndQueuesPractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void testFixedStack() {
		FixedStack<String> stack = new FixedStack<>();

		stack.push("To");
		System.out.println();
		assertSame(stack.pop(), "To");

		stack.push("To");
		stack.push("Be");
		stack.push("Or");
		stack.push("Not");
		assertSame(stack.pop(), "Not");
		assertSame(stack.pop(), "Or");
		assertSame(stack.pop(), "Be");

		stack.push("Be");
		stack.push("Or");
		stack.push("Not");
		stack.push("To");
		stack.push("Be");
		assertSame(stack.pop(), "Be");
		assertSame(stack.pop(), "To");
		assertSame(stack.pop(), "Not");
		assertSame(stack.pop(), "Or");
		assertSame(stack.pop(), "Be");
		assertSame(stack.pop(), "To");

		stack.push("To");
		stack.push("Be");
		stack.push("Or");
		stack.push("Not");
		stack.push("To");
		stack.push("Be");
		stack.push("To");
		stack.push("Be");
		stack.push("Or");
		stack.push("Not");
		// stack.push("To");
		// stack.push("Be"); due to the fixed capacity, the stack can only hold
		// a certain number of elements.
	}

	@Test
	public void testAutoResizeStack() {
		FixedAutoResizeStack<String> stack = new FixedAutoResizeStack<>();

		stack.push("To");
		stack.push("Be");
		stack.push("Or");
		stack.push("Not");
		stack.push("To");
		stack.push("Be");
		stack.push("To");
		stack.push("Be");
		stack.push("Or");
		stack.push("Not");
		stack.push("To");
		stack.push("Be");
		assertSame(stack.pop(), "Be");
		assertSame(stack.pop(), "To");
		assertSame(stack.pop(), "Not");
		assertSame(stack.pop(), "Or");
		assertSame(stack.pop(), "Be");
		assertSame(stack.pop(), "To");
		assertSame(stack.pop(), "Be");
		assertSame(stack.pop(), "To");
		assertSame(stack.pop(), "Not");
		assertSame(stack.pop(), "Or");
		assertSame(stack.pop(), "Be");
		assertSame(stack.pop(), "To");
	}

	@Test
	public void testLinkedListStack() {
		LinkedListStack<String> stack = new LinkedListStack<>();
		stack.push("To");
		stack.push("Be");
		stack.push("Or");
		stack.push("Not");
		stack.push("To");
		stack.push("Be");
		stack.push("To");
		stack.push("Be");
		stack.push("Or");
		stack.push("Not");
		stack.push("To");
		stack.push("Be");
		assertSame(stack.pop(), "Be");
		assertSame(stack.pop(), "To");
		assertSame(stack.pop(), "Not");
		assertSame(stack.pop(), "Or");
		assertSame(stack.pop(), "Be");
		assertSame(stack.pop(), "To");
		assertSame(stack.pop(), "Be");
		assertSame(stack.pop(), "To");
		assertSame(stack.pop(), "Not");
		assertSame(stack.pop(), "Or");
		assertSame(stack.pop(), "Be");
		assertSame(stack.pop(), "To");
		
		stack.push("To");
		System.out.println();
		assertSame(stack.pop(), "To");

		stack.push("To");
		stack.push("Be");
		stack.push("Or");
		stack.push("Not");
		assertSame(stack.pop(), "Not");
		assertSame(stack.pop(), "Or");
		assertSame(stack.pop(), "Be");

		stack.push("Be");
		stack.push("Or");
		stack.push("Not");
		stack.push("To");
		stack.push("Be");
		assertSame(stack.pop(), "Be");
		assertSame(stack.pop(), "To");
		assertSame(stack.pop(), "Not");
		assertSame(stack.pop(), "Or");
		assertSame(stack.pop(), "Be");
		assertSame(stack.pop(), "To");		
	}
	
	@Test
	public void testLinkedListIterato() {
		LinkedListStack<String> stack = new LinkedListStack<>();
		
		stack.push("Be");
		stack.push("To");
		stack.push("Not");
		stack.push("Or");
		stack.push("Be");
		stack.push("To");
		
		stack.push("Be");
		stack.push("To");
		stack.push("Not");
		stack.push("Or");
		stack.push("Be");
		stack.push("To");
		
		stack.push("Be");
		stack.push("To");
		stack.push("Not");
		stack.push("Or");
		stack.push("Be");
		stack.push("To");
		
		stack.push("Be");
		stack.push("To");
		stack.push("Not");
		stack.push("Or");
		stack.push("Be");
		stack.push("To");
		
		for (String text: stack) {
			System.out.print(text + " ");
		}
	}
}
