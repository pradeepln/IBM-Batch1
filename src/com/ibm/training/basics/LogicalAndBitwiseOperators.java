package com.ibm.training.basics;

public class LogicalAndBitwiseOperators {

	public static void main(String[] args) {
		int age = 11;
		
		String name = "something";
		
		if( (age >= 18) && (name.length() > 0)) {
			System.out.println("we know the person is adult and know the name!");
		}else {
			System.out.println("either not adult or we dont know name...");
		}

	}

}
