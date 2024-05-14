package com.ibm.training.basics;
class GrandParent{
	
	void m1() {
		
	}
}

class Parent1 extends GrandParent{
	@Override
	void m1() {
		
	}
}

class Parent2 extends GrandParent{
	@Override
	void m1() {
		
	}
}

class Child extends Parent1//,Parent2{
{	
}

public class DiamondProblemCPP {

	public static void main(String[] args) {
		
		Child c = new Child();
		doSome(c);
	}
	
	public static void doSome(GrandParent polyParam) {
		polyParam.m1();
	}

}
