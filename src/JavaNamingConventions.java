//package com.ibm.training // packages in all lower case
public class JavaNamingConventions { // Class/Intf name starts with upper case letter. Every Word begins with upper

	final int MIN_AGE = 18; // notice constants in all caps. multiple words separated by _
	
	int age; // notice var names begin with lower case
	String firstName; // notice camel casing

	public void read() { // method names begin with lower case

	}

	public void readFile(String fileName) { // notice camel casing

	}
	
	// special purpose
	// class named A$B -----> means B is an inner class of A
	
	// var or methods begining with _
	//_service()
	//_height
	// they are genrated code
	
	
}
