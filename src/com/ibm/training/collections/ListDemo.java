package com.ibm.training.collections;

import java.util.ArrayList;

import com.ibm.training.basics.Employee;

public class ListDemo {

	public static void main(String[] args) {
		//simpleRawList();
		specificListDemo();
	}

	private static void specificListDemo() {
		ArrayList<String> sList = new ArrayList<String>();
		ArrayList<Integer> iList = new ArrayList<Integer>();
		
		sList.add("abc");
		sList.add("xyz");
		//sList.add(123);
		
		
		
		
		iList.add(123);
		iList.add(234);
		//iList.add(23.45);
		//iList.add("123");
		
		String firstWord = sList.get(0);
		Integer firstNum = iList.get(0);
		
		
	}

	private static void simpleRawList() {
		ArrayList l = new ArrayList();
		
		System.out.println("size before: "+l.size());
		
		l.add("first");
		l.add("second");
		l.add(3);
		l.add(new Employee(4, "someone"));
		
		System.out.println("size after: "+l.size());
		
		String first = (String) l.get(0);
		Integer third = (Integer) l.get(2);
		Employee emp = (Employee) l.get(3);
		
		System.out.println("list contents b4 remove\n"+l);
		
		l.remove(3);
		
		System.out.println("size after remove: "+l.size());
		System.out.println("list contents after remove\n"+l);
		
		System.out.println("Adding at index 1 (sencond pos)...");
		l.add(1, "one and half");
		System.out.println("after inserting at index 1\n"+l);
		System.out.println("replacing/setting at index 2....");
		l.set(2, "duos");
		System.out.println("after replacing/setting at index 2\n"+l);
		l.add("end");
		System.out.println(l);
	}

}
