//Global Var can be use in any block
//Global var have default values so we can use them without initialization

class GlobalVarExample{
	int i =1;
	static int a=10; // can declare and init in single line
	static int b; // can access in any block
	// // b=20; //cannot use exactly where it has been declared gives CTE: <identifier> expected
	static float c;
	public static void main(String[] args) {
		if(true){
			b = 20; 
			System.out.println(a);
			System.out.println(c);
			// i++; // non-static variable i cannot be referenced from a static context
		}
		System.out.println(a);

		System.out.println(b);
		System.out.println(c);

		// System.out.print(i); //CTE:non-static variable i cannot be referenced from a static context
	}
}