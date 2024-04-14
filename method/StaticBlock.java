//without main method
/*import java.util.*;
class StaticBlock{
	static int op;
	static{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		op = addition(num1,num2);
		System.out.print(op);
		System.exit(0);
	}
	public static int addition(int num1,int num2) {
		op=num1+num2;
		return op;
	}
}*/

/*class StaticBlock{
	static{
		System.out.println("Hello from SB 1");
	}
	public static void main(String[] args) {
		System.out.println("Hello from main()");
	}
	static{
		System.out.println("Hello from SB 2");
	}
}*/

/*class StaticBlock{
	static{
		System.out.println("Hello from SB 1");
	}
	public static void main(String[] args) {
		System.out.println("Hello from main()");
		StaticBlock1.m1();
	}
	static{
		System.out.println("Hello from SB 2");
	}
}
class StaticBlock1{
	static{
		System.out.println("Hello from SB 3");
	}
	public static void m1() {
		System.out.println("Hi from m1()");
	}
}*/

/*class StaticBlock{
	static{
		System.out.println("Hello from SB 1");
		StaticBlock1.m1();
	}
	public static void main(String[] args) {
		System.out.println("Hello from main()");
		StaticBlock1.m1();
	}
}
class StaticBlock1{
	static{
		System.out.println("Hello from SB 2");
	}
	public static void m1() {
		System.out.println("Hi from m1()");
	}
}*/

/*class StaticBlock{
	static{
		System.out.println("Hello from SB 1");
		StaticBlock1.m1();
	}
	static{
		System.out.println("Hello from SB 2");
	}
	public static void main(String[] args) {
		System.out.println("Hello from main()");
	}
}
class StaticBlock1{
	static{
		System.out.println("Hello from SB 3");
	}
	public static void m1() {
		System.out.println("Hi from m1()");
	}
}*/

class StaticBlock{
	static{
		System.out.println("Hello from SB 1");
	}
	public static void m1() {
		System.out.println("Hello from m1()");
	}
	public static void main(String[] args) {
		System.out.println("Hello from main()");
		m1();
		StaticBlock1.m2();
	}
}
class StaticBlock1{
	static{
		System.out.println("Hello from SB 2");
	}
	public static void m2() {
		System.out.println("Hi from m1()");
	}
}