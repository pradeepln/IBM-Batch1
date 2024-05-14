

public class VarInitialization {

	int instI; // instance and static have default values : 0,null,false
	static boolean isInitRqd;
	static String name;
	static char c;
	
	public static void main(String[] args) {
		
		int[] iArr;
		
		iArr = new int[20];
		
		
		int localI; // Local vars don't have a default value
		
		//System.out.println(localI); // error to use local vars w/o init
		
		VarInitialization obj = new VarInitialization();
		
		System.out.println(obj.instI);
		
		System.out.println(isInitRqd);

		System.out.println(name);
		
		System.out.println(c);
		
		int temp = c;
		System.out.println(temp);
	}

}
