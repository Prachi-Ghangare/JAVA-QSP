class Parent{
	void greeting(){
		System.out.println("Good Morning");
	}
}
class Child extends Parent{
	void greeting(){
		System.out.println("Good Afternoon");
	}
}
class MethodOverridingEx{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.greeting();
	}
}

/*class Parent{
	void Business(){
		System.out.println("Cloth Business");
	}
}
class Child extends Parent{
	void Business(){
		System.out.println("Restaurant Business");
	}
}
class MethodOverridingEx{
	public static void main(String[] args) {
		Parent obj = new Child(); //upcasting
		Child obj1 = (Child)obj; //downcasting
		obj1.Business();
	}
}*/