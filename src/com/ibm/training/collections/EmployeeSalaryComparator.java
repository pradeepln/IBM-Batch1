package com.ibm.training.collections;

import java.util.Comparator;

import com.ibm.training.basics.Employee;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return (int) (e1.getSalary() - e2.getSalary());
	}
}
