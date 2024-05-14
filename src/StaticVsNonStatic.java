
public class StaticVsNonStatic {

	int i;
	static int SI;
	
	public static void main(String[] args) {
		StaticVsNonStatic obj1 = new StaticVsNonStatic();
		StaticVsNonStatic obj2 = new StaticVsNonStatic();
		
		obj1.i = 10; obj2.i = 20;
		System.out.println(obj1.i +" "+obj2.i);
		
		StaticVsNonStatic.SI = 44;
		System.out.println(StaticVsNonStatic.SI);
//		following is permitted but misleading and therefore compiler warns. AVOID
//		System.out.println(obj1.SI);
//		obj1.SI++;
		System.out.println(StaticVsNonStatic.SI);

	}

}
