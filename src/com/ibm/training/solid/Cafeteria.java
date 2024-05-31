package com.ibm.training.solid;

public class Cafeteria   {
	
	TemperatureController tc = new TemperatureController();
	
	public Cafeteria() {
		tc.manageTemp(30, 20);
	}

}
