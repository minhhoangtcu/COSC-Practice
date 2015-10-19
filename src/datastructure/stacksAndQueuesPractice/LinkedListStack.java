package datastructure.stacksAndQueuesPractice;

import java.util.Iterator;

public class LinkedListStack<E> implements StackInterface<E>, Iterable<E>{
	
	private LinkedNode<E> firstNode;
	private int N; //size of the stack
	
	public LinkedListStack() {
		firstNode = null;
	}
	
	public void push(E item) {
		LinkedNode<E> newNode = new LinkedNode<E>(item);
		if (!isEmpty())
			newNode.next = firstNode;
		firstNode = newNode;
		N++;
	}

	public E pop() {
		if (isEmpty()) 
			return null;
		else {
			E data = firstNode.data;
			firstNode = firstNode.next;
			N--;
			return data;
		}
	}

	public boolean isEmpty() {
		return N == 0;
	}

	@Override
	public Iterator<E> iterator() {
		return new LinkedListStackIterator();
	}
	
	private class LinkedListStackIterator implements Iterator<E>{
		private LinkedNode<E> current = firstNode;
		public boolean hasNext() {
			return (current != null);
		}
		public E next() {
			E data = current.data;
			current = current.next;
			return data;
		}
	}
}
