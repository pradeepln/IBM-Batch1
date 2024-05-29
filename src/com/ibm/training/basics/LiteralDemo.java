package com.ibm.training.basics;

public class LiteralDemo {

	public static void main(String[] args) {
		double mystery = 42; //implicit type cast at work here 
		//System.out.println(mystery);
		
		
		m1(42);
		m1(42L);
		m1(42F);
		m1(42d);
		m1(42.0f);
		m1(42.0);
		
		String name = "pradeep"; // string literal
		char c = 'a'; // char literal
		c++;
		System.out.println(c);
		int i = c; //implicit type cast at work here
		System.out.println(i);
		
		int iLit = 100;
		int octalLit = 0123;
		System.out.println(octalLit);
		int hexLit = 0x1231a;
		System.out.println(hexLit);
		
		char indianChar = '\u0c85';
		System.out.println(indianChar);
		
		System.out.println("\u0c85\u0c86");
	}
	
	public static void m1(int x) {
		//some logic
	}
	
	public static void m1(long x) {
		//some logic
	}
	
	public static void m1(float x) {
		//some logic
	}
	
	public static void m1(double x) {
		//some logic
	}

}
