interface Interface{
	int a=10;
	void m1(); 
	default void m2(){
		System.out.println("Hello from default m2()");
		m3();
	}
	private void m3(){
		System.out.println("Hello from private m3()");
		m4();
	}
	public static void m4(){
		System.out.println("Hello from static m4()");
	}
}

class Implementation implements Interface{
	public void m1(){
		System.out.println("Hello from implemented abstract m1()");
		m2();
	}
}

class InterfaceEx2{
	public static void main(String[] args) {
		Implementation obj = new Implementation();
		obj.m1();
	}
}