class MethodExample{
	/*public static void main(String[] args) {
		System.out.println("Main Starts");
		Method1();
		System.out.println("Main Ends");
	}
	public static void Method1() {
		System.out.println("Method1 Starts");
		Method2();
		System.out.println("Method1 Ends");
	}
	public static void Method2() {
		System.out.println("Method2 Starts");
		Method3();
		System.out.println("Method2 Ends");
	}
	public static void Method3() {
		System.out.println("Method3 Starts");
		System.out.println("Method3 Ends");
	}*/

	/*public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		add(a,b); // 30
	}
	public static void add(byte num1, byte num2) {
		int op = num1+num2;
		System.out.print(op);
	}*/

	/*public static void main(String[] args) {
		byte a = 10;
		add(a,20); //CTE:incompatible types: possible lossy conversion from int to byte
	}
	public static void add(byte num1, byte num2) {
		System.out.print("byte,byte");
	}*/

	/*public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		add(a+0,b); //CTE:no suitable method found for add(int,byte)
		 //int,byte
	}
	public static void add(byte num1, byte num2) {
		int op = num1+num2;
		System.out.print(op);
	}
	public static void add(byte num1, int num2) {
		int op = num1+num2;
		System.out.print(op);
	}*/

	/*public static void main(String[] args) {
		byte a = 10;
		add(a,20); //CTE:method add(byte,int) is already defined
	}
	public static void add(byte num1, int num2) {
		System.out.print("byte,int");
	}
	public static int add(byte num1, int num2) {
		System.out.print("byte,int");
		return 0;
	}*/

	/*public static void main(String[] args) {
		byte a = 10;
		add(a,20); //CTE:method add(byte,int) is already defined
	}
	public static void add(byte num1, int num2) {
		System.out.print("byte,int");
	}
	public static void add(byte num1, int num2) {
		System.out.print("byte,int");
	}*/

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		add(a,b); // reference to add is ambiguous
	}
	public static void add(byte num1, int num2) {
		System.out.print("byte,int");
	}
	public static void add(int num1, byte num2) {
		System.out.print("int,byte");
	}
	public static void add(int num1, int num2) {
		System.out.print("int,int");
	}
	
	/*public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		add(a,b); // byte,byte
	}
	public static void add(byte num1, byte num2) {
		System.out.print("byte,byte");
	}
	public static void add(int num1, byte num2) {
		System.out.print("int,byte");
	}
	public static void add(int num1, int num2) {
		System.out.print("int,int");
	}*/

	/*public static void main(String[] args) {
		demo('A');  //CTE: no suitable method found for demo(char) 
	}
	public static void demo(byte a) {
		System.out.print("byte");
	}
	public static void demo(short a) {
		System.out.print("short");
	}*/
	

	/*public static void main(String[] args) {
		demo('A');  // int
	}
	public static void demo(byte a) {
		System.out.print("byte");
	}
	public static void demo(short a) {
		System.out.print("short");
	}
	public static void demo(int a) {
		System.out.print("int");
	}*/

	/*public static void main(String[] args) {
		demo('A');  // char
	}
	public static void demo(byte a) {
		System.out.print("byte");
	}
	public static void demo(short a) {
		System.out.print("short");
	}
	public static void demo(int a) {
		System.out.print("int");
	}
	public static void demo(char a) {
		System.out.print("char");
	}*/
}