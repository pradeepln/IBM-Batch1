package com.ibm.training.exceptions;

public class StackApp {

	public static void main(String[] args) {
		StackUser u = new StackUser();
		
		FixedArrayStack fas = new FixedArrayStack(9);
		
		u.fill(fas);
		
		//DynamicSizeStack das = new DynamicSizeStack();
		
		//u.fill(das);

	}

}
