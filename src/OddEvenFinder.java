
public class OddEvenFinder {

	public static void main(String[] args) {
		
		String firstArg = args[0];
		int num = Integer.parseInt(firstArg);
		
		if(isEven(num)) {
			System.out.println(num + " is even.");
		}else {
			System.out.println(num + " is odd.");
		} 
 
	}

	public static boolean isEven(int num) {
		return num % 2 == 0;		
	}
}
