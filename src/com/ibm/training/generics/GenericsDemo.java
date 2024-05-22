package com.ibm.training.generics;

public class GenericsDemo {
	
	

	public static void main(String[] args) {
		Stack<Integer> s = new FixedArrayStack<Integer>(10);
		
		//s.push("iiii");
		s.push(123);
		
		Integer i = s.pop();
		
		Stack<String> ss = new FixedArrayStack<>(12);
		
		ss.push("jj");
		//ss.push(232);
		
		String ssv = ss.pop();

	}

}
