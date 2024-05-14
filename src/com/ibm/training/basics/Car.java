package com.ibm.training.basics;
//					IS A
public class Car extends Vehicle {

	//car has other imp - ac, music
	
	@Override
	public void start() {
		System.out.println("<<<< Car STarting >>>>");
	}
	
	@Override
	public void stop() {
		System.out.println("<<<< Car Stopping >>>>");
	}
	
	public void playMusic() {
		System.out.println("<<<<< la la la .... >>>>>");
	}
	
}
