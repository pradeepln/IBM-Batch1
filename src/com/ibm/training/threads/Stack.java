package com.ibm.training.threads;

public interface Stack {
	
	public void push(Object anElement);
	public Object pop();
	
	public default int size() {
		throw new UnsupportedOperationException("size not overriden!");
	}
}
