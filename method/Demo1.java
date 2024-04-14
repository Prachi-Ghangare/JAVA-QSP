class Demo1{
	public static void m1() {
		System.out.println("Hi from external Demo1 m1()");
		Demo2.m2("m2()");
	}
}

class Demo2{
	public static void m2(String name) {
		System.out.println("Hi from external Demo2 "+name);
	}
}