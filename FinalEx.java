final class Class{
	static final int a=10;
	final void m1(){
		System.out.println("Hello from final method");
	}
} 

class Child extends Class{
	void m1(){
		System.out.println("Hello from Child final method");
	}
}
class FinalEx{
	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(obj.a);
		obj.m1();	
	}
}