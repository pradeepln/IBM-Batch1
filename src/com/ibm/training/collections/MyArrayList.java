package com.ibm.training.collections;

public class MyArrayList { //imaging implements List

	Object[] contents = new Object[10];
	int lastIndex = -1;
	
	public Object get(int index) {
		return contents[index];
	}
	public void add(Object anElement) {
		increaseCapacityOfArrayIfNeeded();
		contents[++lastIndex] = anElement;		
	}
	
	public void set(int index,Object anElement) {
		contents[index] = anElement;		
	}
	
	public void add(int index, Object anElement) {
		increaseCapacityOfArrayIfNeeded();
		//down/right shift all elements at index or above
		//after that only
		contents[index] = anElement;
	}
	
	public void increaseCapacityOfArrayIfNeeded() {
		if(lastIndex == contents.length - 1) {
			Object[] biggerArray = new Object[(int) (contents.length * 1.5)];
			System.arraycopy(contents,0,biggerArray,0,contents.length);
			this.contents = biggerArray;
		}
	}
}
