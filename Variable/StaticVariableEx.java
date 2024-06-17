class StaticVariableEx{
	static String str = "Hi I am a static var";
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(str);
		m1();
	}
	public static void m1() {
		System.out.println("Hi from m1()");
		System.out.println(str);
	}
}

/*class StaticVariableEx{
	static String str = "Hi I am a static var";

	static{
		System.out.println(str);
	}
	public static void main(String[] args) {
		System.out.println("Hi from main()");
		System.out.println(str);
		m1();
	}
	public static void m1() {
		System.out.println("Hi from m1()");
		System.out.println(str);
	}
}*/

/*class StaticVariableEx{
	static String str = "Hi I am a static var";
	public static void main(String[] args) {
		StaticVariableEx obj = new StaticVariableEx();
		System.out.println("Hello World");
		obj.m1();
	}
	public void m1() { //non-static method
		System.out.println("Hi from m1()");
		System.out.println(str);
	}
}*/

/*class StaticVariableEx{
	static int i=10;
	public static void main(String[] args) {
		int i=20;
		System.out.println(StaticVariableEx.i);
		System.out.println(i);
		StaticVariableEx2.m2();
	}
}

class StaticVariableEx2{
	public static void m2() {
		System.out.println(StaticVariableEx.i);
	}
}*/

/*class StaticVariableEx{
	static int i=10;
	public static void main(String[] args) {
		int i=20;
		System.out.println(StaticVariableEx.i); //10
		System.out.println(i); //20
		StaticVariableEx2.m2(); 
		m1();
	}
	public static void m1() {
		System.out.println(i); //50
		StaticVariableEx2.m2(); 
	}
}

class StaticVariableEx2{
	static int j=StaticVariableEx.i;
	public static void m2() {
		System.out.println(StaticVariableEx.i); //10
		StaticVariableEx.i=50; 
		m3();
	}
	public static void m3() {
		System.out.println(j); //10
		System.out.println(StaticVariableEx.i); //50
	}
}*/

