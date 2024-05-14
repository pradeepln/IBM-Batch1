
public class ConvertPrimitivesString {

	public static void main(String[] args) {
		String numAsStr = "11";
		
		int i = 42;
		
		int j = Integer.parseInt(numAsStr); // similarly Float.parseFloat and so on

		//String answer = String.valueOf(i);
		
		String answer = ""+i;
	}

}
