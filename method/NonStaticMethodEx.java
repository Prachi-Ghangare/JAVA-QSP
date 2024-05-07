class NonStaticMethodEx{
	public static void main(String[] args) {
		System.out.println("Hello from main");
		NonStaticMethodEx obj = new NonStaticMethodEx();
		obj.m1();
	}
	void m1(){
		System.out.println("Hello from m1()");
		NonStaticMethodEx1 obj = new NonStaticMethodEx1();
		obj.m2();
	}
}

class NonStaticMethodEx1{
	void m2(){
		System.out.println("Hello from m2()");
		m3();
	}
	void m3(){
		System.out.println("Hello from m3()");
	}
}

/*class NonStaticMethodEx{
	public static void main(String[] args) {
		System.out.println("Hello from main");
		NonStaticMethodEx obj = new NonStaticMethodEx();
		obj.m1();
	}
	void m1(){
		System.out.println("Hello from m1()");
		NonStaticMethodEx1 obj = new NonStaticMethodEx1();
		m2();
	}
	void m2(){
		System.out.println("Hello from m2()");
	}
}
*/


