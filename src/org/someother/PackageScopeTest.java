package org.someother;

import com.ibm.training.basics.*;
import com.ibm.training.basics.Driver;

import static java.lang.Math.*; // notice static import

public class PackageScopeTest {

	public static void main(String[] args) {
		Driver d = new Driver();

		Car c;
		
		//GrandParent gp;
		
		double sin90 = sin(90); //static import
		double cos90 = cos(90);
	}

}
