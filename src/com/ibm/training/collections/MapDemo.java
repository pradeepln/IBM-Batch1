package com.ibm.training.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		simpleMapOps();
		//Object[][] contents = new Object[5][100];
	}

	private static void simpleMapOps() {
		Map<String,Integer> runsMap = new LinkedHashMap<>();
		runsMap.put("rohit", 78);
		runsMap.put("gill", 54);
		runsMap.put("virat", 23);
		runsMap.put("bumrah", 99);
		runsMap.put("virat", 45);
		
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a batsman name: ");
			String input = kb.nextLine();
			if(input.equalsIgnoreCase("quit")) { break; }
			
			if(runsMap.containsKey(input)) {
				int runs = runsMap.get(input);
				System.out.println(input+" ----> "+runs);
			}else {
				System.out.println("No data for "+input);
			}
		}
		System.out.println("_____________");
		Set<String> keys = runsMap.keySet();
		for(String aKey : keys) {
			System.out.println(aKey+" ---------> "+runsMap.get(aKey));
		}
	}

}
