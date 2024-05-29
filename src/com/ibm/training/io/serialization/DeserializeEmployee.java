package com.ibm.training.io.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeserializeEmployee {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("d:/temp/MayB1/emp.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e = (Employee) ois.readObject();
		
		System.out.println(e);
	}

}
