package com.ibm.training.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeDemo {

	public static void main(String[] args) {
		
		
		
		LocalDate today = LocalDate.now();
		
		printDate(today);

		LocalDate june4th = LocalDate.of(2024, Month.JUNE, 4);
		
		printDate(june4th);
		
		LocalDate yesterday = today.minusDays(1);
		
		printDate(yesterday);
		
		LocalDate thisDayLastYear = today.minusYears(1);
		printDate(thisDayLastYear);
		
		LocalDate threeMonthsAfterResult = june4th.plusMonths(3);
		printDate(threeMonthsAfterResult);
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a date (dd/MM/yyyy):");
		
		String dateAsString = kb.nextLine();
		LocalDate aDate = LocalDate.parse(dateAsString,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		printDate(aDate);
	}

	private static void printDate(LocalDate aDate) {
		System.out.println("_____________________");
		System.out.println("Year: "+aDate.getYear());
		System.out.println("Month: "+aDate.getMonth().name());
		System.out.println("Day: "+aDate.getDayOfMonth());
		System.out.println("DOW: "+aDate.getDayOfWeek());
		
		System.out.println(aDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

}
