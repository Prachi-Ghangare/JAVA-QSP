class Parent{
	private abstract void greeting();
}

class Child extends Parent{
	void greeting(){
		System.out.println("Good Morning");
	}
}

class AbstractMethodEx{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.greeting();
	}
}