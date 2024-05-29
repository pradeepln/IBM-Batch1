package com.ibm.training.singleton;

public class Singleton {
	
	//imagine very heavy resources here
	
	private static Singleton instance;// = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
