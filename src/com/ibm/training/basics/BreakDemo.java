package com.ibm.training.basics;

public class BreakDemo {

	public static void main(String[] args) {
		System.out.println("Before any loop");
		
		int i = 1;
		
		outerloop:while(true) {
			System.out.println(" i is "+i);
			
			for(int j=0;j<10;j++) {
				System.out.println("inside inner loop....");
				if(j == 1) {
					break outerloop;
				}
			}
			System.out.println("after for loop");
			if(i == 7) {
				System.out.println("i is 7, therefore breaking out..");
				break;
			}
			System.out.println("after checking if i == 7");
			i++;
		}
		
		System.out.println("after all looping");

	}

}
