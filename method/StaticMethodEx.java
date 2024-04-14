class StaticMethodEx{
	public static void main(String[] args) {
		m1();
		Demo.m2();
	}

	public static void m1() {
		System.out.println("Hello from m1()");
	}
}
class Demo{
	public static void m2() {
		System.out.println("Hello from m2()");
	}
}

/*class StaticMethodEx{
	public static void main(String[] args) {
		m1();
		StaticMemberEx.m1();
		m2();
		StaticMemberEx.m1();
	}

	public static void m1() {
		System.out.println("Hello from m1()");
	}

	public static void m2() {
		System.out.println("Hello from m2()");
	}
}*/

/*class StaticMethodEx{
	public static void main(String[] args) {
		m1();
		Demo1.m1(); //external java file
		Demo2.m2("m2()"); //external java file
	}

	public static void m1() {
		System.out.println("Hello from m1()");
	}
}*/

/*class StaticMethodEx{
	public static void main(String[] args) {
		m1();
		Demo1.m1(); //external java file
		Demo2.m2("m2()"); //external java file
		myClass.myMethod("Prachi",2024);
	}

	public static void m1() {
		System.out.println("Hello from m1()");
	}
}

class myClass{
	public static void myMethod(String name,int yop) {
		System.out.println("My Info");
		System.out.println("Name - "+name);
		System.out.println("YOP - "+yop);
	}
}*/

/*class StaticMethodEx{
	public static void main(String[] args) {
		m1(); //CTE:non-static method m1() cannot be referenced from a static context
		Demo.m2();
	}

	void m1() {
		System.out.println("Hello from m1()");
	}
}
class Demo{
	public static void m2() {
		System.out.println("Hello from m2()");
	}
}*/

/*class StaticMethodEx{
	public static void main(String[] args) {
		StaticMemberEx obj = new StaticMemberEx();
		obj.m1(); 
		Demo.m2();
	}

	void m1() {
		System.out.println("Hello from m1()");
	}
}
class Demo{
	public static void m2() {
		System.out.println("Hello from m2()");
	}
}*/