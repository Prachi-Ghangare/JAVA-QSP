class Parent{
	String str = "Hi from parent class";
	void m1(){
		System.out.println("Hi from parent m1()");
	}
	static void m3(){
		System.out.println("Hi from parent static m3()");
	}
}

class Child extends Parent{
	String str = "Hi from child class";
	void m2(){
		System.out.println("Hi from child m2()");
		m1();
		m3();
		System.out.println(str);
		System.out.println(super.str);
	}
	static void m4(){
		System.out.println("Hi from child static m4()");
	}
}

class InherDriver{
	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(obj.str);
		obj.m1();
		obj.m2();
		obj.m3(); //accessing ststic method using obj ref
		obj.m4(); //accessing ststic method using obj ref
	}
}