package com.ibm.training.basics;

public class GCDiscussion {
	static ChemicalElement h = new ChemicalElement(1, "Hydrogen", "H");

	public static void main(String[] args) {
		
		int localToMainI = 10;
		m1();
		//spot z
	}

	private static void m1() {
		float f = 123f;
		Employee e1 = new Employee(12, "sam");
		m2(e1);
		//spot y
	}

	private static void m2(Employee e) {
		char c = 'h';
		Car car = new Car();
		//marker x
	}

}
