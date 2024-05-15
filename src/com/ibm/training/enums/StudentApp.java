package com.ibm.training.enums;

public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		assignGrade(s1,79);
		assignGrade(s2,82);
	}

	private static void assignGrade(Student s, int marks) {
		if(marks >= 90) {
			//s.setGrade(IGrade.GRADE_A);
			s.setGrade(Grade.A);
		}else if(marks >= 80 && marks < 90) {
			//s.setGrade(IGrade.GRADE_B);
			s.setGrade(Grade.B);
		}
		//s.setGrade('^');
		
	}

}
