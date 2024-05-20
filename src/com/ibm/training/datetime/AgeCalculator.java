package com.ibm.training.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your birtday (dd-MM-yyyy):");
		String input = kb.nextLine();
		
		LocalDate birthday = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate today = LocalDate.now();

		Period timePeriod = Period.between(birthday, today.plusDays(1));
		
		System.out.println("You are "+timePeriod.getYears()+" years, "+timePeriod.getMonths()+" months and "+timePeriod.getDays()+" days old!");
	}

}
