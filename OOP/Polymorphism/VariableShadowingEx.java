/*class VariableShadowingEx{
	int a = 10; //shadow by local var a of m1()
	public static void m1() {
		int a = 20;
		System.out.println(a); //20
	}
	public static void main(String[] args) {
		m1();
	}
}*/

class Parent{
	int a = 30;
}

class Child extends Parent{
	int a = 20;
	public void m1() {
		int a = 10;	
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);	
	}
}

class VariableShadowingEx{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
	}
}