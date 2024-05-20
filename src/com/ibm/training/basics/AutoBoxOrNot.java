package com.ibm.training.basics;

public class AutoBoxOrNot {

	public static void main(String[] args) {
		removeElement(74);
		Integer intObj = 74;
		removeElement(intObj);
//		removeElement(new Integer(74));
		
	}

	
	public static void removeElement(Object anElement) {
		//search somewhere for anElement and if found remove.
	}
	
	public static void removeElement(int anIndex) {
		// remove element at anIndex.
	}
}
