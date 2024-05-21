package com.ibm.training.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		Set<String> uniqueWords = new LinkedHashSet<>();
		
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
		for(String aWord : uniqueWords) {
			System.out.println(aWord);
		}
		

	}

}
