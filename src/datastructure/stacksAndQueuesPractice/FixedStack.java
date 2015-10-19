package datastructure.stacksAndQueuesPractice;

public class FixedStack<E> implements StackInterface<E>{
	
	protected E[] elements;
	private int N;
	
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
//		stack.push("Be"); due to the fixed capacity, the stack can only hold a certain number of elements.
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
}
