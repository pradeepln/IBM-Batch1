package com.ibm.training.io.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeEmployee {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("d:/temp/MayB1/emp.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Employee e = new Employee(7, "Bames Jond", 1234f);
		
		oos.writeObject(e);
		
		oos.flush();
	}

}
