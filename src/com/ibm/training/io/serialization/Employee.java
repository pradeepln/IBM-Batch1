package com.ibm.training.io.serialization;

import java.io.Serializable;

public class Employee implements Comparable<Employee>,Serializable {

	int id;
	String name = "TBD";
	float salary;
	
	public Employee() {
		System.out.println("The no-arg 'default' constructor");
	}
	public Employee(int id,String name,float salary) {
		
		System.out.println("------- inside 3 arg constructor ------");
		this.id = id;
		this.name = name;
		this.salary = salary;
		//complex logic related to which team this emp is fit
	}
	
	public Employee(int id,String name) {
		this(id,name,0); // this is allowed only as first statement of a constructor
		System.out.println("------- inside 2 arg constructor ------");
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public int compareTo(Employee other) {
		//System.out.println(">>>> sort called compareTo on employee"+this.id+" with param emplyee"+other.id);
		if(this.id > other.id) {
			return 1;
		}else if(other.id > this.id) {
			return -1;
		}else {
			return 0;
		}
		
		//return this.id - other.id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}

class Engineer extends Employee{
	public Engineer(int id,String name) {
		super(id,name);
	}
}

