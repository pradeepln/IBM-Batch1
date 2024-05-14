package com.ibm.training.basics;

//final 
public class FinalDemo {

	final public void some() {
		
	}
	public static void main(String[] args) {
		final int i = 10;
		
//		i++;
//		
//		i = 25;

		System.out.println("hello "+i);
		
		final Employee e1 = new Employee(1, "uno");
		
		//e1 = new Employee(2, "duos"); //finality means reference can not be re-assigned
		
		e1.name = "whatever..."; //final doesnt mean object immutable
	}

}

//class SubClass extends FinalDemo{
//	@Override
//	public void some() {
//		
//	}
//}