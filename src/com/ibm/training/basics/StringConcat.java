package com.ibm.training.basics;

public class StringConcat {

	public static void main(String[] args) {
		int i = 12 + 14; // + means arithmetic add

		String s = "12" + 14; // + means concat

		// above is equivalent to ===> String s = "12".concat(String.valueOf(14));

		System.out.println(i);
		System.out.println(s);

	}

}
