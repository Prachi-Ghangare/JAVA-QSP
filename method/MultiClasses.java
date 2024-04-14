/*class MultiClasses{
	public static void main(String[] args) {
		System.out.println("Hello from MultiClass main()");
		Demo.main(args);
	}
}

class Demo{
	public static void main(String [] args) {
		System.out.print("Hello from Demo main()");
	}
}*/

/*class MultiClasses{
	public static void main(String[] args) {
		System.out.println("Hello from MultiClass main()");
		Demo.m1(); 
	}
}

class Demo{
	public static void m1() {
		System.out.print("Hello from Demo m1()");
	}
}*/

/*class MultiClasses{ 
	public static void main(String[] args) {
		System.out.println("Hello from MultiClass main()");
		Demo1.m1(); //calling method from another java file
	}
}*/

/*class MultiClasses{
	public static void main(String[] args) {
		System.out.println("Hello from MultiClass main()");
		Demo.m1(); //CTE:class Demo is public, should be declared in a file named Demo.java
	}
}

public class Demo{
	public static void m1() {
		System.out.print("Hello from Demo m1()");
	}
}*/

/*public class MultiClasses{
	public static void main(String[] args) {
		System.out.println("Hello from MultiClass main()");
		m1(); //CTE:class Demo is public, should be declared in a file named Demo.java
	}
}

public class Demo{
	public static void m1() {
		System.out.print("Hello from Demo m1()");
	}
}
*/

/*class MultiClasses{
	class Demo{
		public static void m1() {
			System.out.print("Hello from Demo m1()");
		}
	}
	public static void main(String[] args) {
		System.out.println("Hello from MultiClass main()");
		Demo.m1(); 
	}
}*/

class MultiClasses{
	public static void main(String[] args) {
		System.out.println("Hello from MultiClasses main()");
		m1(); 
		// MultiClasses.m1();
		OuterDemo.m1();
		OuterDemo.InnerDemo.m1();
		OutClass.m1();
		Demo1.m1(); //external java file
	}
	public static void m1() {
		System.out.println("Hello from MultiClasses m1()");
	}
}
class OuterDemo{
	public static void m1() {
		System.out.println("Hello from OuterDemo m1()");
	}
	class InnerDemo{
		public static void m1() {
			System.out.println("Hello from InnerDemo m1()");
		}
	}
}
class OutClass{
	public static void m1() {
		System.out.println("Hello from OutClass m1()");
	}
}



