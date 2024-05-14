
public class Employee {

	int id;
	String name;
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
	
	
}

class Engineer extends Employee{
	public Engineer(int id,String name) {
		super(id,name);
	}
}

