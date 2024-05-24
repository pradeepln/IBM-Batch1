package com.ibm.training.threads;

public class PrimeCounterThread extends Thread{

	long count;
	
	long begin,end;
	
	public PrimeCounterThread(long begin, long end) {
		super();
		this.begin = begin;
		this.end = end;
	}

	@Override
	public void run() {
		System.out.println("STarting prime counting from "+begin+" to "+end+" in "+Thread.currentThread().getName());
		
		for(long i = begin; i <= end; i++) {
			if(isPrime(i)) {
				count++;
				//System.out.println("Found a prime "+i+" in thread "+Thread.currentThread().getName());
			}
		}
		System.out.println("Finished prime counting from "+begin+" to "+end+" in "+Thread.currentThread().getName());
	}
	
	public static boolean isPrime(long num) {
		if (num <= 2) {
			return true;
		}
		for (long i = 2; i < num; i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		return true;
	}


	public long getCount() {
		return count;
	}
}
