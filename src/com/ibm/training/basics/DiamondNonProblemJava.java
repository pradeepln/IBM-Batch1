package com.ibm.training.basics;
interface IGrandParent {
	void m1();
}

interface IParernt1 extends IGrandParent {
	void m1();
}

interface IParent2 extends IGrandParent {
	void m1();
}

class IntChild implements IParernt1, IParent2 {

	@Override
	public void m1() {

	}

}

public class DiamondNonProblemJava {

	public static void main(String[] args) {

		IntChild c = new IntChild();
		doSome(c);
	}

	public static void doSome(IGrandParent polyParam) {
		polyParam.m1();
	}

}
