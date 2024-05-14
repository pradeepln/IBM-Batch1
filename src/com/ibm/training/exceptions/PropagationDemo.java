package com.ibm.training.exceptions;

public class PropagationDemo {

	public static void main(String[] args) {
		m1();
		System.out.println("finished all.....");
	}

	private static void m1() {
		m2();
		
	}

	private static void m2() {
		try {
			m3();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught exception in m2, class name: "+e.getClass().getName());
			System.out.println("MEssage contained = "+e.getMessage());
			System.out.println("Following is the stack trace....");
			e.printStackTrace();
			
		}
		
		System.out.println("Finished handling exception in m2 ... OR it never occured");
	}

	private static void m3() {
		int[] nums = {12,24,35,56,72};
		
		for(int i = 0;i<=5;i++) {
			
			try {
				int resu = nums[i]/i;
				System.out.println("Element at index "+i+" is "+nums[i]);
				System.out.println("Line after nums[i].....");
			}catch (ArithmeticException e) {
				System.out.println("class = "+e.getClass().getName());
				System.out.println("msg = "+e.getMessage());
				continue;
			}
		}
		
	}

}
