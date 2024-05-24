package com.ibm.training.optionals;

import java.util.Optional;

import com.ibm.training.basics.Employee;

public class EmpGUIApp {

	public static void main(String[] args) {
		EmployeeDBHelper helper = new EmployeeDBHelper();
		
		// read id from ui
		int id = 10;
	
		//classical 'defensive' way to use optional
//		Optional<Employee> o = helper.findEmployeeFrom(id);
//
//		if (o.isPresent()) {
//			Employee e = o.get();
//			//display in ui
//			System.out.println(e.getName());
//			System.out.println(e.getSalary());
//		}
		
		Employee defaultEmp = new Employee(0, "not found", 0);
		
		Employee e = helper.findEmployeeFrom(id).orElse(defaultEmp);
		
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}

}
