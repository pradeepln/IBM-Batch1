
class PrimitiveVsReference {

	public static void main(String[] args) {
		
		// local primitives are allocated on the stack
		
		int age = 42; // age is a primitive var
		
		char ch = 'a'; // ch is a primitive
		
		boolean isWorking = true; // isWorking is primitive
		
		
		// -------- notice 'new' operator is reqd to allocate mem to ref types but not to primitives
		
		// objects and arrays (allocated with 'new') always allocated on heap
		
		String name = new String("Pradeep"); // name is ref type var
		String name2 = "Pradeep"; // convenience bec String is commonly used type. name2 is still a ref
		
		
		int[] ages = new int[10]; // ages is ref type var
		

		StringBuilder sb = new StringBuilder(); //sb is a ref
		
		//------------------ Another diiference follows --------------
		
		ages[0] = 24;
		
		m1(age); //primitives are passed by value (a copy will be passed)
		System.out.println(age);
		m2(ages); // objects and arrays are passed by reference (a pointer is passed)
		System.out.println(ages[0]);
		
	}
	
	public static void m1(int i) {
		i++; // i = i+1;
	}
	
	public static void m2(int[] nums) {
		nums[0]++; //nums[0] = nums[0]+1
	}

}
