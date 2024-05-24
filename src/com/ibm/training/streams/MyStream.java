package com.ibm.training.streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStream {
	List src;
	
	Object[] steps = new Object[10];
	int idx = 0;
	
	
	public MyStream(List src) {
		this.src = src;
	}
	
	
	public MyStream map(Function f) {
		steps[idx++] = f;
		return this;
	}
	
	public MyStream filter(Predicate p) {
		steps[idx++] = p;
		return this;
	}
	
	public Object findFirst() {
		for(Object aValue:src) {
			for(Object aStep : steps) {
				if(aStep instanceof Function) {
					Function f = (Function) aStep;
					f.apply(aValue);
				}else if(aStep instanceof Predicate) {
					Predicate p = (Predicate) aStep;
					p.test(aValue);
				}
			}
			
			
		}
		return "result";
	}
}
