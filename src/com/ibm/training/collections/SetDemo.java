package com.ibm.training.collections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
//		Set<String> uniqueWords = new LinkedHashSet<>();
		TreeSet<String> uniqueWords = new TreeSet<>();
		
		while(true) {
			System.out.println("Enter a unique word: ");
			String input = kb.nextLine();
			if(input.equalsIgnoreCase("quit")) {break;}
			
			boolean added = uniqueWords.add(input);
			if(!added) {
				System.out.println("That was not unique!");
			}
		}
		
		System.out.println("___________ all unique words ___________");
		//uniqueWords.get(0);
//		for(String aWord : uniqueWords) {
//			System.out.println(aWord);
//		}
		
		for(String aWord : uniqueWords.descendingSet()) {
			System.out.println(aWord);
		}
		

	}

}
