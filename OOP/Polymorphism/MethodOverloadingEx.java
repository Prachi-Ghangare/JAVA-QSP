class MethodOverloadingEx{
	public static void main(String[] args) {
		System.out.println("JVMs main method");
		main();
		main(10);
	}
	public static void main() {
		System.out.println("no arg main method");
	}
	public static void main(int a) {
		System.out.println("1 arg main method");
	}
}

/*class MethodOverloadingEx{
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
	}
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void add(int a,int b,int c,int d) {
		System.out.println(a+b+c+d);		
	}
}*/

/*class Parent{
	public void greeting() {
		System.out.println("Good Morning");
	}
}

class Child extends Parent{
	public void greeting(int a) {
		System.out.println("Good Afternoon"); 	
	}
}

class MethodOverloadingEx{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.greeting(10);
	}
}*/

/*class MethodOverloadingEx{
	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10,20);
	}
	public static void m1() {
		System.out.println("no arg m1()");
	}
	private static void m1(int a) {
		System.out.println("1 arg m1()");
	}
	static void m1(int a,int b) {
		System.out.println("2 arg m1()");
	}
}*/

/*class Parent{
	private void greeting() {
		System.out.println("Good Morning");
	}
}

class Child extends Parent{
	public void greeting(int a) {
		System.out.println("Good Afternoon"); 	
	}
}

class MethodOverloadingEx{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.greeting(10);
	}
}*/

