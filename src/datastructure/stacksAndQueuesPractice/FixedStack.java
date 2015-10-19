package datastructure.stacksAndQueuesPractice;

import java.util.Iterator;

/*
 * First in Last out stack.
 */
public class FixedStack<E> implements StackInterface<E>, Iterable<E>{
	
	protected E[] elements;
	protected int N; //size of the stack
	
	/*
	 * Fast testing method.
	 * TODO: remove this and create an individual test case if needed
	 */
	public static void main(String[] args) {
		FixedStack<String> stack = new FixedStack<>();
		
		stack.push("To");
		System.out.println(stack.pop());
		
		stack.push("To");
		stack.push("Be");
		stack.push("Or");
		stack.push("Not");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		stack.push("Be");
		stack.push("Or");
		stack.push("Not");
		stack.push("To");
		stack.push("Be");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
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
//		stack.push("To");
//		stack.push("Be"); due to the fixed capacity, the stack can only hold a certain number of elements.
		
		for (String item: stack) {
			System.out.println(item);
		}
	}
	
	public FixedStack() {
		this(10);
	}
	
	public FixedStack(int size) {
		elements = (E[]) new Object[size];
	}
	
	public void push(E item) {
		elements[N++] = item; 
	}
	
	public E pop() {
		E output = elements[--N];
		elements[N] = null;
		return output;
	}
	
	public boolean isEmpty() {
		return N == 0;
	}

	public Iterator<E> iterator() {
		return new StackIterator();
	}
	
	/*
	 * The Iterator will stack with the item last inserted first. 
	 */
	protected class StackIterator implements Iterator<E>{
		private int index = N;
		public boolean hasNext() {
			return index > 0; 
		}
		public E next() {
			return elements[--index];
		}
		public void remove() {};
	}
}
