package com.ibm.training.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalInterfaceDemo {
	
	public static <C> List<C> allMatches(List<C> input,MyCondition<C> condition){
		List<C> output = new ArrayList<>();
		for(C aValue : input) {
			if(condition.test(aValue)) {
				output.add(aValue); 
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String[] words = {"axis", "this", "is", "a", "strange", "set", "of", "words", "about", "nothing", "and",
		"everything" };
		List<String> sampleData = Arrays.asList(words);
		//List<String> fourLetterWords = allMatches(sampleData, new FourLetterCondition());
		List<String> fourLetterWords = allMatches(sampleData, s -> s.length() == 4);
		System.out.println(fourLetterWords);
		List<String> smallWords = allMatches(sampleData, s -> s.length() <= 3);
		System.out.println(smallWords);
		
		List<String> wordsWithE = allMatches(sampleData, s -> s.contains("e"));
		System.out.println(wordsWithE);
		
		List<Integer> iList = List.of(12,42,23,51,24);
		List<Integer> evens = allMatches(iList, num -> num % 2 == 0);
	}

}

//class FourLetterCondition implements MyCondition{
//	@Override
//	public boolean test(String aValue) {
//		return aValue.length() == 4;
//	}
//}