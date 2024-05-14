package com.ibm.training.basics;

public class IdentityOperator {

	public static void main(String[] args) {
		int i = 23;
		int j = 23;
		
		int[] iArray = new int[1];
		iArray[0] = 67;
		int[] jArray = new int[1];
		jArray[0] = 67;
		
		System.out.println("i==j? "+(i==j)); //== checks if 'values' are same (primitives)
		System.out.println("iArray==jArray? "+(iArray==jArray)); // == checks if 'objects pointed by reference' are same (references)

	}

}
