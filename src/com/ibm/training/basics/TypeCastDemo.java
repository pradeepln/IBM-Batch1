package com.ibm.training.basics;

public class TypeCastDemo {

	public static void main(String[] args) {
		
		int i = args.length;
		
		double mystery = 42; //implicit type cast at work here 
		System.out.println(mystery);
		
		long l = i;//implicit type cast at work here 

		float f = 21.1f;

		
		int wholePart = (int) f;
		
		System.out.println("whole part = "+wholePart);
	}

}
