package datastructure.stacksAndQueuesPractice;

public interface StackInterface<E> {
	
	/*
	 * push an item into the stack
	 */
	public void push(E item);
	public E pop();
	public boolean isEmpty();

}
