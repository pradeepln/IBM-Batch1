package com.ibm.training.basics;

public class ConstructorDemo {

	public static void main(String[] args) {
//		Employee e1 = new Employee();
//		e1.id = 1;
//		e1.name = "founder";
//		e1.salary = 0;
		
		//ContinueDemo.helper.toString();
		
		Employee e1 = new Employee(1, "founder", 0);
		
		Employee e2 = new Employee(2, "someone");
		
		Employee blankFello = new Employee();

	}

}
