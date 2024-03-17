// Local Variable does not have default values so we cannot use them without initialization
// In this var y is not initialized so we get error for printing y that variable y might not have been initialized
// we cannot use local var other than the block where it has been declared
// In this we have used string a for printing outside the block so it gives error

class LocalVarExample{
	public static void main(String[] args) {
		if(true){
			String a = "Local Variable from method block";
			String b ="LV from if block";
			System.out.println(a);
			System.out.print(b);
		}
		if(true){
			int x = 10;
			int y;
			System.out.print(x);
			System.out.print(y); // CTE:variable y might not have been initialized
		}
		// System.out.print(a); //CTE:cannot find symbol
	}
}