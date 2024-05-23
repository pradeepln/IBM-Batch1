package com.ibm.training.streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		String[] words = {"axis", "this", "is", "a", "strange", "set", "of", "words", "about", "nothing", "and",
		"everything" };
		
		Stream
		.of(words)
		.forEach(s -> System.out.println(s));
		
		Stream
			.of(words)
			.map(s -> s.length())
			.map(num -> num * 2)
			.map(d -> Math.sin(d))
			.forEach(i -> System.out.println(i));
		
		List<Double> dList= Stream
								.of(words)
								.map(s -> s.length())
								.map(num -> num * 2)
								.map(d -> Math.sin(d))
								.toList();
		System.out.println(dList);

	}

}
