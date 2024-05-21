package com.ibm.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.ibm.training.basics.Employee;

public class ListDemo {

	public static void main(String[] args) {
		//simpleRawList();
		//specificListDemo();
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("xyz");
		list.add("tvf");
		someAlgo(list);
	}

	private static void someAlgo(List<String> list) {
		//some
		list.add(0, "uno");
		
		//some more
		list.remove(1);
		
		//some more more
		String some = list.get(3);
		
		//loop and process every element
		//DON'T DO THIS : DON'T LOOP USING GET(I)
		for(int i=0;i<list.size();i++) {
			String aValue = list.get(i);
			//do something with aValue
		}
		
		//Explicit Iterator - this is efficient
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String aValue = it.next();
			//do something with aValue
			if(aValue.startsWith("x")) {
				it.remove();
			}
		}
		
		//Implicit Iterator - Enhanced For Loop - this is efficient
		
		for(String aValue : list) {
			//do something with aValue
		}
		
		//Compiler converts the above for-each loop into something like following
		String aValue2;
		for(Iterator<String> it2=list.iterator();it2.hasNext();aValue2=it2.next()) {
			
		}
		
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
