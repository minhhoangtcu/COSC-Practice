package datastructure.stacksAndQueuesPractice;

/*
 * This is a stack using fixed-capacity (an array)
 * The size of this stack will automatically resize. 
 */
public class FixedAutoResizeStack<E> extends FixedStack<E>{
	
	public FixedAutoResizeStack() {
		this(5);
	}
	
	public FixedAutoResizeStack(int size) {
		elements = (E[]) new Object[size];
	}
	
	public void push(E item) {
		if (N == elements.length)
			elements = resize(2*elements.length);
		elements[N++] = item;
	}
	
	public E pop() {
		E output = elements[--N];
		elements[N] = null;
		if (N > 0 && N == elements.length/4)
			elements = resize(elements.length/2);
		return output;
	}
	
	private E[] resize(int newSize) {
		E[] temp = (E[]) new Object[newSize];
		for (int i = 0; i < N; i++) {
			temp[i] = elements[i];
		}
		return temp;
	}
}
