class Demo{
	public static void main(String[] args) {
		System.out.println("Hello from main()");
		Demo obj = new Demo();
		obj.m1();
	}
	void m1() {
		System.out.println("Hello from m1()");
		Demo1 obj = new Demo1();
		obj.m2();
	}
}

class Demo1{
	void m2(){
		System.out.println("Hello from m2()");
		m3();
	}
	void m3(){
		System.out.println("Hello from m3()");
	}
}

/*class Demo{
	static Demo obj;
	static String name;
	public static void main(String[] args) {
		System.out.println(obj); //null
		System.out.println(name); //null
		name = "Ramesh";
		System.out.println(name); //Ramesh
		obj = new Demo();
		System.out.println(obj); //Demo@372f7a8d
	}
}*/