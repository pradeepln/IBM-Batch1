package com.ibm.training.lambdas;

import java.util.Arrays;

public class LambdaDemo {

	public static void main(String[] args) {
		String[] words = { "this", "is", "a", "strange", "set", "of", "words", "about", "nothing", "and",
		"everything" };
		
		System.out.println(Arrays.asList(words));
		
		//Arrays.sort(words, (s1,s2) -> s1.length() - s2.length());
		
		Arrays.sort(words, (s1,s2) -> s2.length() - s1.length());
		
		System.out.println(Arrays.asList(words));
	}

}
