class Parent{
	public static void m1() {
		System.out.println("Hi from m1()");
	}
}

class Child extends Parent{
	public static void m1() {
		System.out.println("Hi from Child m1()");
	}
}

class ExceptionEx1{
	public static void main(String[] args) {
		System.out.println("Main method starts");
		Parent obj = new Parent();
		try{
			Child obj1 = (Child)obj;
			obj.m1();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Main method ends");
		
	}
}