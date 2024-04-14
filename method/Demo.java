import java.util.Scanner;
class Demo{
	public static void main(String [] args) { //calling method
		Scanner sc =new Scanner(System.in);
		System.out.println("Hello from main()");
		myMethod(); //method call statement
		checkEvenOdd(10);
		//			  ^ actual argument
	}

	public static void myMethod(){ //no argument method  // called method
		System.out.println("Hello from myMethod()");
	}

								// formal arguments
	public static void checkEvenOdd(int num){ //called method
		if(num%2==0)
			System.out.println(num+" is an Even Number");
		else
			System.out.println(num+" is a Odd Number");
	}
}