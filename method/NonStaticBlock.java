class NonStaticBlock{

	{
		System.out.println("Hello from non static block");
	}
	public static void main(String[] args) {
		System.out.println("Hello form main");
		NonStaticBlock obj = new NonStaticBlock();
		obj.m1();
	}
	void m1(){
		System.out.println("Hello from m1()");
	}
}

/*class NonStaticBlock{

	{
		System.out.println("Hello from non static block 1");
	}
	public static void main(String[] args) {
		System.out.println("Hello form main");
		NonStaticBlock obj = new NonStaticBlock();
		obj.m1();
	}
	{
		System.out.println("Hello from non static block 2");
	}
	void m1(){
		System.out.println("Hello from m1()");
	}
}*/

/*class NonStaticBlock{

	{
		System.out.println("Hello from non static block 1");
		m1();
	}

	public static void main(String[] args) {
		System.out.println("Hello form main");
		NonStaticBlock obj = new NonStaticBlock();
	}

	{
		System.out.println("Hello from non static block 2");
	}

	void m1(){
		System.out.println("Hello from m1()");
	}
}*/

/*class NonStaticBlock{
	String str = "Hi I am static var";
	{
		System.out.println("Hello from non static block 1 ");
	}
	public static void main(String[] args) {
		System.out.println("Hello form main");
		NonStaticBlock obj1 = new NonStaticBlock();
		NonStaticBlock obj2 = new NonStaticBlock();
		obj1.m1();
		obj2.m2();
	}
	void m1(){
		System.out.println("Hello from m1()");
	}
	void m2(){
		System.out.println("Hello from m2()");
		System.out.println(str);
	}
	{
		System.out.println("Hello from non static block 2 ");
	}
}*/

/*class NonStaticBlock{

	NonStaticBlock(){
		System.out.println("Hi I am a constructer");
	}

	{
		System.out.println("Hello from non static block");
	}
	public static void main(String[] args) {
		System.out.println("Hello form main");
		NonStaticBlock obj = new NonStaticBlock();
	}
}*/