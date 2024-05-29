package com.ibm.training.basics;

public class VarargsDemo {
	
	public static void m1(int i) {
		//
	}
	
	public static void m2(String s, int... nums) {
		System.out.println("len: "+nums.length);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
	}

	public static void main(String... args) {
		m1(42);
		//int[] ia = new int[] {34,56,67};
		m2("a",34,56,67);
	}

}
