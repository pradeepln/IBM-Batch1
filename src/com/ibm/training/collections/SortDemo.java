package com.ibm.training.collections;

import com.ibm.training.basics.Employee;

public class SortDemo {

	public static void main(String[] args) {
		sortStringArray();

	}

	private static void sortStringArray() {
		String[] words = {"this","is","a","strange","set","of","words","about","nothing","and","everything"};
		
		Employee e = new Employee(1, "uno");
		
		System.out.println(e.toString());
		
		System.out.println(words);
		
	}

}
