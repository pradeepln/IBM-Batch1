
public class DOWFinder {
	
	public String findDOW(int day,int month,int year) {
		int numDays = 0; //this is total num of days elapsed since jan 1st 1900
		
		numDays += (year - 1900) * 365;
		numDays += (year - 1900) / 4;
		if(year % 4 == 0 && month <= 2) {
			numDays--;
		}
		//-------at this stage numDays has num of days elpsed up to dec 31st previous year
		switch(month) {
		case 12: numDays += 30;
		case 11: numDays += 31;
		case 10: numDays += 30;
		case 9: numDays += 31;
		case 8: numDays += 31;
		case 7: numDays += 30;
		case 6: numDays += 31;
		case 5: numDays += 30;
		case 4: numDays += 31;
		case 3: numDays += 28;
		case 2: numDays += 31;
		}
		// -------at this stage numdays has num of days elapsed up to last day of previous month
		
		numDays += day; // num of days elapsed in current month
		
		// -------at this stage numdays has num of days elapsed up to given day from j1st 1900
		
		int dowIndex = numDays % 7;
		String[] days = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
			
		return days[dowIndex];
	}

	public static void main(String[] args) {
		DOWFinder finder = new DOWFinder();
		String day = finder.findDOW(9,1,2024);
		System.out.println(day);

	}

}
