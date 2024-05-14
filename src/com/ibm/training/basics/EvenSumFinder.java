package com.ibm.training.basics;

public class EvenSumFinder {

	public static void main(String[] args) {
		
		if(! (args.length >= 2)) {
			System.out.println("Usage : java EvenSumFinder <startNum> <endNum>");
			return;
		}
		
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		
		long sum = 0;
		
		int aNum = start;
		
		while(aNum <= end) {
			if(OddEvenFinder.isEven(aNum)) {
				sum += aNum; // sum = sum + aNum
			}
			
			aNum++;
		}
		
		System.out.println("Sum of all Evens between "+start+" and "+end+" is "+sum);

	}

}
