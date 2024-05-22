package com.ibm.training.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodDemo {
	
//	public static Object pickBestElementFrom(List l) {
//		//return based on some logic
//		return l.get(0);
//	}

	public static <T> T pickBestElementFrom(List<T> l) {
		//return based on some logic
		return l.get(0);
	}
	
	
	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
		sList.add("hi");sList.add("hello");
		
		List<Integer> iList = new ArrayList<>();
		iList.add(123);iList.add(345);
		
		
		String bestString = pickBestElementFrom(sList);
		Integer bestNum = pickBestElementFrom(iList);
		
		//Double bestD =  (Double) pickBestElementFrom(sList);

	}

}
