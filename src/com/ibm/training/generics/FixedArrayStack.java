package com.ibm.training.generics;

public class FixedArrayStack<E> implements Stack<E>{
	
	Object[] contents;
	int top = -1;

	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
	}
	
	@Override
	public void push(E anElement) {
		contents[++top] = anElement;
	}
	
	@Override
	public E pop() {
		return (E) contents[top--];
	}
}
