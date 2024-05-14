
public class StudentGradeCalculator {

	public static void main(String[] args) {
		StudentGradeCalculator sgc = new StudentGradeCalculator();
		
//		System.out.println(sgc.getGrade(70));
//		System.out.println(sgc.getGrade(60));
//		System.out.println(sgc.getGrade(50));
//		System.out.println(sgc.getGrade(45));
//		System.out.println(sgc.getGrade(35));
//		System.out.println(sgc.getGrade(34));
		
		String arg = args[0];
		float marks = Float.parseFloat(arg);
		String grade = sgc.getGrade(marks);
		
		switch(grade) {
		case "first":
			System.out.println("Congrats! You get 10000");
			break;
		case "second":
			System.out.println("Good! You get 5000");
			break;
		case "pass":
			System.out.println("You get 3000");
			break;
		default:
			System.out.println("Better Luck Next Time!");
		}
	}
	
	
	
	public String getGrade(float marks) {
		if(marks >= 60) {
			return "first";
		}else if(marks >= 50 && marks < 60) {
			return "second";
		}else if(marks >= 35 && marks < 50) {
			return "pass";
		}else {
			return "fail";
		}
	}

}
