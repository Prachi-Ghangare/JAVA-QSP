abstract class Parent{
	abstract public void m1();
	abstract public void m2();
	public void m3(){
		System.out.println("Hello from parent m3()");
	}
}

abstract class Child1 extends Parent{
	public void m1(){
		System.out.println("Hello from Child1 m1()");
	}
	public void m2(){
		System.out.println("Hello from Child1 m2()");
	}
	abstract void m4();
}

class Child2 extends Parent{
	public void m1(){
		System.out.println("Hello from m1() implementation from Child2");
	}
	public void m2(){
		System.out.println("Hello from m2() implementation from Child2");
	}
	public void m5(){
		System.out.println("Hello from Child2 m5()");
	}
}

class SubChild extends Child1{
	public void m1(){
		System.out.println("Hello from m1() implementation from Child1");
	}
	public void m4(){
		System.out.println("Hello from SubChild m4() implementation");
	}
}

class AbstractionEx1{
	public static void main(String[] args) {
		SubChild obj = new SubChild();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		Child2 obj1 = new Child2();
		obj1.m1();
		obj1.m2();
		obj1.m3();
		obj1.m5();
	}
}