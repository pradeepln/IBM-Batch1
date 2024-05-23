package com.ibm.training.basics;

public class ChemicalElement implements Comparable<ChemicalElement> {
	
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

	
	public int getAtomicNumber() {
		return atomicNumber;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + atomicNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChemicalElement other = (ChemicalElement) obj;
		if (atomicNumber != other.atomicNumber)
			return false;
		return true;
	}

	@Override
	public int compareTo(ChemicalElement other) {
		
		//return this.atomicNumber - other.atomicNumber;
		return this.symbol.compareTo(other.symbol);
	}
	
}
