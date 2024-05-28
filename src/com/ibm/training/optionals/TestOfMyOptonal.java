package com.ibm.training.optionals;

import java.util.Optional;

import com.ibm.training.basics.Employee;

public class TestOfMyOptonal {
	
	public static Optonal<Employee> findEmployeeFrom(int id) {
		//select * from employee where emp_id=?
		boolean found = false;
		if(found) {
			//read from db resultset
			return Optonal.of(new Employee(id, "some name from db"));
		}else {
			return Optonal.empty();
		}
	}

	public static void main(String[] args) {
		Optonal<Employee> o =  findEmployeeFrom(23);
		
		if(o.isPresent()) {
			Employee e = o.get();
		}

	}

}
