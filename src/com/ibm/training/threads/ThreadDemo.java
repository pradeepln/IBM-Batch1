package com.ibm.training.threads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		//byExtendingThread();
		//byImplementingRunnable();
		threadSafeDS();
	}

	private static void threadSafeDS() {
		Map<String, String> simpleHM = new HashMap<>(); // is NOT thread-safe
		
		Map<String,String> syncHM = Collections.synchronizedMap(new HashMap<>()); //all methods are synchronized
		
		Map<String,String> concHM = new ConcurrentHashMap<>(); // thread-safe and high performance ds
	}

	private static void byImplementingRunnable() throws InterruptedException {

		System.out.println("In thread... " + Thread.currentThread().getName());

		PrimeCounterTask task1 = new PrimeCounterTask(1, 100_000);
		PrimeCounterTask task2 = new PrimeCounterTask(100_001, 200_000);

		long startTime = System.currentTimeMillis();
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();

		
		t1.join();
		t2.join();

		long totalPrimes = task1.getCount() + task2.getCount();

		long endTime = System.currentTimeMillis();
		System.out.println("Total : " + totalPrimes + " in " + (endTime - startTime) + " ms");
	}

	private static void byExtendingThread() throws InterruptedException {

		System.out.println("In thread... " + Thread.currentThread().getName());

		PrimeCounterThread thread1 = new PrimeCounterThread(1, 200_000);
		// PrimeCounterThread thread2 = new PrimeCounterThread(100_001, 200_000);

		long startTime = System.currentTimeMillis();
		thread1.start();
		// thread2.start();

		thread1.join();
		// thread2.join();

		long totalPrimes = thread1.getCount();// + thread2.getCount();

		long endTime = System.currentTimeMillis();
		System.out.println("Total : " + totalPrimes + " in " + (endTime - startTime) + " ms");
	}

}
