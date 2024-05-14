package com.ibm.training.basics;

public class ChemicalApp {

	public static void main(String[] args) {
		
		
		ChemicalElement h = new ChemicalElement(1,"H","Hydrogen");
		ChemicalElement ga = new ChemicalElement(31, "Ga", "Gallium");
		ChemicalElement k = new ChemicalElement(19, "K", "Potassium");
		ChemicalElement o = new ChemicalElement(8, "O", "Oxygen");
		
		
		
		System.out.println("Is Oxygen an Alkali? " + h.isAlkaliMetal());
		
		System.out.println("Is Potassium an Alkali? " + k.isAlkaliMetal());
		
		System.out.println("Is Gallium an transition metal? "+ ga.isTransitionMetal());
		
		System.out.println("Is Pot an transition metal? "+ k.isTransitionMetal());
		
		//----------------- Equality tests
		
		System.out.println("h == k " + (h == k));
		System.out.println("h.equals(k) " + (h.equals(k)));
		
		ChemicalElement h2 = new ChemicalElement(1, "h", "Hydrogenium");
		System.out.println("h == h2 " + (h == h2));
		System.out.println("h.equals(h2) " + (h.equals(h2)));
		
		printDetails(ga);
	}
	
	
	public static void printDetails(ChemicalElement c) {
		
		System.out.println("_____________________");
		System.out.println("Atomic Number: "+c.getAtomicNumber());
		System.out.println("Name and Symbol: "+c.getName()+" "+c.getSymbol());
		System.out.println("Is it a metal? "+c.isMetal());
		System.out.println("Is it a trans metal? "+c.isTransitionMetal());
		System.out.println("Is it an alkali? "+c.isAlkaliMetal());
	}

}
