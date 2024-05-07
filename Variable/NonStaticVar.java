/*class NonStaticVar{
	String str1 = "Hi I am a non-static var";
	public static void main(String[] args) {
		System.out.println("Hello from main");
		NonStaticVar1 obj = new NonStaticVar1();
		obj.m1();
	}
}

class NonStaticVar1{
	static NonStaticVar obj = new NonStaticVar();
	void m1(){
		System.out.println("Hi from m1()");
		System.out.println(obj.str1);
		m2();
	}
	void m2(){
		System.out.println("Hi from m2()");
		System.out.println(obj.str1);
		m3();
	}
	static void m3(){
		System.out.println("Hi from m3()");
		System.out.println(obj.str1);
	}
}*/

/*class NonStaticVar{
	String str1 = "Hi I am a non-static var";
	public static void main(String[] args) {
		NonStaticVar obj = new NonStaticVar();
		System.out.println("Hello from main");
		obj.m1();
		System.out.println(obj.str1);
	}
	void m1(){
		System.out.println("Hi from m1()");
		NonStaticVar1 obj1 = new NonStaticVar1();
		System.out.println(this.str1);
		obj1.m2();
	}
}

class NonStaticVar1{
	void m2(){
		System.out.println("Hi from m2()");
		m3();
	}
	static void m3(){
		System.out.println("Hi from m3()");
	}
}*/

/*class NonStaticVar{
	static String str = "Global var";
	public static void main(String[] args) {
		String str = "Local var from main";
		System.out.println("Hello from main");
		NonStaticVar obj = new NonStaticVar();
		System.out.println(obj.str);
		System.out.println(str);
		obj.m1();
	}
	public void m1(){
		String str = "Local var of m1()";
		System.out.println(str);
		System.out.println(this.str);
	}
}*/

class NonStaticVar{
	String a;
	int b;
	public static void main(String[] args) {
		System.out.println("Hello from main");
		NonStaticVar obj = new NonStaticVar();
		System.out.println("a : "+obj.a); //null
		System.out.println("b : "+obj.b); //0
		obj.m1();
	}
	void m1(){
		System.out.println("Hello from m1()");
		System.out.println("a : "+a); //null
		System.out.println("b : "+b); //0
		a="Ramesh";
		b=10;
		System.out.println(a); //Ramesh
		System.out.println(b); //0
	}
}


/*class NonStaticVar{
	String str = "Hi I am a non-static var";
	public static void main(String[] args) {
		System.out.println("Hello from main");
		NonStaticVar1 obj = new NonStaticVar1();
		System.out.println(obj.str);
		obj.m1();
	}
}

class NonStaticVar1{
	String str = "Global Var of NonStaticVar1";
	static NonStaticVar obj = new NonStaticVar();
	void m1(){
		System.out.println("Hi from m1()");
		System.out.println(obj.str);
		m2();
	}
	void m2(){
		System.out.println(str);
	}
}*/
