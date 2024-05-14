package com.ibm.training.basics;

public class InnerClassDemo {

	public static void main(String[] args) {
		Outer o = new Outer();
		
		o.outerMethod();
		
		Outer.Inner inn = o.getInner();
		inn.innerMethod();
		
		Outer.StaticInner si = new Outer.StaticInner();
	}

}


class Outer{
	private int outerI = 20;
	private static int staticOuterI = 34;
	public void outerMethod() {
		outerI =  24;
	}
	
	public Inner getInner() {
		return new Inner();
	}
	
	class Inner{
		private int innerI = 42;
		
		public void innerMethod() {
			outerI++;
			System.out.println(outerI);
		}
	}
	
	static class StaticInner{
		
		public void staticInnerMethod() {
			//outerI++;
			staticOuterI++;
		}
	}
}