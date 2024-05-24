package com.ibm.training.optionals;

import java.util.Optional;

import com.ibm.training.basics.Employee;

public class EmployeeDBHelper {
	
	public Optional<Employee> findEmployeeFrom(int id) {
		//select * from employee where emp_id=?
		boolean found = false;
		if(found) {
			//read from db resultset
			return Optional.of(new Employee(id, "some name from db"));
		}else {
			return Optional.empty();
		}
	}

}
