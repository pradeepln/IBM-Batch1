package com.ibm.training.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ibm.training.basics.Employee;

public class SortDemo {

	public static void main(String[] args) {
		// sortStringArray();
		//sortEmployeeArray();
		//sortEmployeeListBasedOnSalary();
		//sortStringArrayonLength();
		sortStringArrayonLengthUsingAnon();
	}
	
	private static void sortStringArrayonLengthUsingAnon() {
		String[] words = { "this", "is", "a", "strange", "set", "of", "words", "about", "nothing", "and",
				"everything" };
	
		System.out.println(Arrays.asList(words));

		Arrays.sort(words,new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});

		System.out.println(Arrays.asList(words));

	}
	

	private static void sortStringArrayonLength() {
		String[] words = { "this", "is", "a", "strange", "set", "of", "words", "about", "nothing", "and",
				"everything" };
	
		System.out.println(Arrays.asList(words));

		Arrays.sort(words,new StringLengthComparator());

		System.out.println(Arrays.asList(words));

	}
	
	
	
	private static void sortEmployeeListBasedOnSalary() {
		Employee e1 = new Employee(1, "founder", 1000);
		Employee e2 = new Employee(2, "someone1", 123);
		Employee e3 = new Employee(4, "someone2", 12);

		Employee[] employees = new Employee[] {e1,e3,e2};
		
		List<Employee> empList = Arrays.asList(employees);
		
		System.out.println(empList);
		
		Collections.sort(empList,new EmployeeSalaryComparator());
		
		System.out.println(empList);
		
	}

	private static void sortEmployeeArray() {
		Employee e1 = new Employee(1, "founder", 1000);
		Employee e2 = new Employee(2, "someone1", 123);
		Employee e3 = new Employee(4, "someone2", 12);

		Employee[] employees = new Employee[] {e1,e3,e2};
		
		System.out.println(Arrays.asList(employees));
		
		Arrays.sort(employees);
		
		System.out.println(Arrays.asList(employees));
	}

	private static void sortStringArray() {
		String[] words = { "this", "is", "a", "strange", "set", "of", "words", "about", "nothing", "and",
				"everything" };

		// creates a new arrayList using the 'same' array as backing array
//		List<String> wordList = Arrays.asList(words);

		// Following creates a new arrayList with a 'new' internal array
//		List<String> wordList = new ArrayList<>();
//		for(String s : words) {
//			wordList.add(s);
//		}

		System.out.println(Arrays.asList(words));

		Arrays.sort(words);

		System.out.println(Arrays.asList(words));

	}

}
