package com.ibm.training.optionals;

public class Optonal<E> {
	
	E realReturnValue;
	boolean present = false;
	
	public static <E> Optonal<E> of(E obj){
		Optonal<E> o = new Optonal<>();
		o.realReturnValue = obj;
		o.present = true;
		return o;
	}
	
	public static Optonal empty() {
		return new Optonal<>();
	}
	
	public E get() {
		if(present) {
			return this.realReturnValue;
		}else {
			throw new IllegalStateException();
		}
	}
	
	public boolean isPresent() {
		return present;
	}

}
