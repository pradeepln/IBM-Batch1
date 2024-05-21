package com.ibm.training.strings;

import java.util.Arrays;

public class StringLiterals {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		
		String s3 = new String("hello");
		String s4 = new String("Hello");
		
		System.out.println("s1 == s2 ? "+(s1 == s2));
		

		System.out.println("s1 == s3 ? "+(s1 == s3));
		
		
		System.out.println("s3 == s4 ? "+(s3 == s4));
		
		
		System.out.println("______________________________________________");
		
		System.out.println("s1 equals s2 ? "+(s1.equals(s2)));
		System.out.println("s1 hc = "+s1.hashCode());
		System.out.println("s2 hc = "+s2.hashCode());
		
		System.out.println("s1 equals s3 ? "+(s1.equals(s3)));
		System.out.println("s3 hc = "+s3.hashCode());
		
		System.out.println("s3 equals s4 ? "+(s3.equals(s4)));
		System.out.println("s4 hc = "+s4.hashCode());
		
		System.out.println("s3 equalsIgnoreCase s4 "+(s3.equalsIgnoreCase(s4)));
		
		String s5 = s1.concat(" world");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s5);
		
		stringOps();
	}

	private static void stringOps() {
		String s1 = "hello java";
		
		//String s2 = s1.toUpperCase();
		String s2 = s1.toLowerCase();
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("s1 == s2 "+(s1 == s2));
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.substring(6,9));
		
		String delim = "1;name;12334";
		String[] tokens = delim.split(";");
		System.out.println(Arrays.asList(tokens));
		
		System.out.println(s1.contains("ello"));
		System.out.println(s1.startsWith("h"));
		
		String s3 = "          hi    ";
		System.out.println(s3);
		System.out.println(s3.trim());
	}
	
	
	

}
