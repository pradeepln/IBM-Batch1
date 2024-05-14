package com.ibm.training.basics;

public class ChemicalElement {
	
	private int atomicNumber;
	private String symbol;
	private String name;
	
	{
		System.out.println("inside instance initializer...");
		name = "tbd";
	}
	
	
	private static boolean[] alkaliMetals = new boolean[120];
	
	static {
		System.out.println("static block 1 , length of array "+alkaliMetals.length);
		alkaliMetals[3] = true;
		alkaliMetals[11] = true;
		alkaliMetals[19] = true;
		alkaliMetals[37] = true;
		alkaliMetals[55] = true;
		alkaliMetals[87] = true;
	}
	
	public ChemicalElement(int atomicNumber,String symbol,String name) {
		System.out.println("inside constructor....");
		this.atomicNumber = atomicNumber;
		this.symbol = symbol;
		this.name = name;
	}
	
	public boolean isMetal() {
				
		switch(atomicNumber) {
		case 13, 49, 50, 81, 82, 83, 113, 114, 115, 116:
			return true;
		default : 
			return false;
		}
		
		/* For Older Java Versions, use the classical style
		 * switch(atomicNumber) { case 13 : return true; case 49 : return true; //...
		 * rest of cases default : return false; }
		 */
	}
	
	static {
		System.out.println("static block 2");
	}
	public boolean isAlkaliMetal() {
		return alkaliMetals[atomicNumber];
	}
	
	public boolean isTransitionMetal() {
		return (atomicNumber >= 21 && atomicNumber <= 31) ||
			   (atomicNumber >= 39 && atomicNumber <= 48) ||
			   (atomicNumber >= 72 && atomicNumber <= 80) ||
			   (atomicNumber >= 104 && atomicNumber <= 112);
	}

	//not perfect yet
	public boolean equals(Object o) {
		ChemicalElement other = (ChemicalElement) o;
		
		return this.atomicNumber == other.atomicNumber;
		
		/*
		 * if(this.atomicNumber == other.atomicNumber) { return true; }else { return
		 * false; }
		 */
	}

	public int getAtomicNumber() {
		return atomicNumber;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	
	
}
