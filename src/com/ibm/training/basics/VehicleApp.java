package com.ibm.training.basics;

public class VehicleApp {

	public static void main(String[] args) {
		Driver d = new Driver();
		Car c = new Car();

		d.drive(c); //type substitution
		
//		Vehicle v = new Vehicle();
//		d.drive(v);
		
		Truck t = new Truck();
		
		d.drive(t); //type substitution
		
//		c = t;
//		c = (Car) t;
//		Vehicle v = new Vehicle();
		
//		Vehicle v1 = new Car();
//		
//		d.drive(v1);
//		
//		v1.start();
//		
//		Vehicle v2 = new Truck();
		
	}

}
