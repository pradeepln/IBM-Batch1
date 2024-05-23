package com.ibm.training.lambdas;

import java.util.Arrays;

public class LambdaDemo {
//arity           ret                  argList
//sig accS  mod   ret       name       argList
	public        int wordsWithEFirst(String word1,String word2){
		
		if(word1.contains("e") && !word2.contains("e")) {
			return -1;
		}else if(word2.contains("e") && !word1.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		String[] words = {"axis", "this", "is", "a", "strange", "set", "of", "words", "about", "nothing", "and",
		"everything" };
		
		System.out.println(Arrays.asList(words));
		
		//Arrays.sort(words, (s1,s2) -> s1.length() - s2.length());
		
		//Arrays.sort(words, (s1,s2) -> s2.length() - s1.length());
		
		//Arrays.sort(words, (s1,s2) -> s1.charAt(0) - s2.charAt(0));
		
		//Arrays.sort(words, (s1,s2) -> s1.substring(0, 1).compareTo(s2.substring(0,1)));
		
		
//		Arrays.sort(words, (s1,s2) -> {
//			
//			if(s1.contains("e") && !s2.contains("e")) {
//				return -1;
//			}else if(s2.contains("e") && !s1.contains("e")) {
//				return 1;
//			}else {
//				return 0;
//			}
//		});
		
		//Arrays.sort(words, (s1,s2) -> wordsWithEFirst(s1, s2) );
		
		LambdaDemo obj = new LambdaDemo();
		
		Arrays.sort(words, obj::wordsWithEFirst);
		
		System.out.println(Arrays.asList(words));
	}

}
