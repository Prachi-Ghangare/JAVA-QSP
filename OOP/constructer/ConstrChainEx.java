/*//Using this call statement
class ConstrChainEx{
	ConstrChainEx(){
		System.out.println("hi from no args constructer");
	}

	ConstrChainEx(int a){
		this();
		System.out.println("Hi from 1 agrs constructer");
	}

	ConstrChainEx(int a, int b){
		this(10);
		System.out.println("Hi from 2 agrs constructer");
	}

	public static void main(String[] args) {
		ConstrChainEx obj = new ConstrChainEx(10,20);
	}
}*/

//Using super call statement
class Parent{
	Parent(){
		// super(); //call by compiler to obj class constructer
		System.out.println("Hi from Parent class constructer");
	}
}

class Child extends Parent{
	Child(){
		super(); //call to parent class constructer
		System.out.println("Hi from Child class constructer");
	}
}

class ConstrChainEx{
	public static void main(String[] args) {
		Child obj = new Child();
	}
}