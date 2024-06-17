interface Parent1{
	void m1();
}

interface Parent2{
	void m2();
}

interface Child extends Parent1,Parent2{
	void m3();
}

class Subchild implements Child{
	public void m1(){
		System.out.println("Implementation for m1()");
	}
	public void m2(){
		System.out.println("Implementation for m2()");
	}
	public void m3(){
		System.out.println("Implementation for m3()");
	}
}

class InterfaceEx1{
	public static void main(String[] args) {
		Subchild obj = new Subchild();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}