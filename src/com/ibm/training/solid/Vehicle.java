package com.ibm.training.solid;

abstract public class Vehicle  {
	
	TemperatureController tc = new TemperatureController();
	
	public Vehicle() {
		tc.manageTemp(50, 30);
	}
//	String fan;
//	public void manageTemp(int high,int low) {
//		//logic
//	}
	//lots of useful impl details - engine , tank battery 
	
//	public void start() {
//		System.out.println("------- Vehicle Strart -------");
//	}
//	
//	public void stop() {
//		System.out.println("------- Vehicle Stop -------");
//	}
	
	public abstract void start();
	public abstract void stop();
}
