/*class FinallyEx1{
	public static void main(String[] args) {
		System.out.println("Exec Starts");
		m1();
		System.out.println("Exec ends");
	}
	static void m1(){
		System.out.println("m1() starts");
		try{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("ArithmeticException Handled");
			// return ;
		}
		finally{
			System.out.println("Hi from finally");
		}
		System.out.println("m1() ends");
	}
}*/

class FinallyEx1{
	public static void main(String[] args) {
		System.out.println("Exec Starts");
		m1();
		System.out.println("Exec ends");
	}
	static void m1(){
		System.out.println("m1() starts");
		try{
			System.out.println("try");
			return ;
		}
		catch(ArithmeticException ae){
			System.out.println("ArithmeticException Handled");
		}
		finally{
			System.out.println("Hello finally");
		}
		System.out.println("m1()");
	}
}

/*class FinallyEx1{
	public static void main(String[] args) {
		System.out.println("Exec Starts");
		m1();
		System.out.println("Exec ends");
	}
	static void m1(){
		System.out.println("m1()");
		try{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("ArithmeticException Handled");
		}
		finally{
			System.out.println("Hello finally");
		}
		System.out.println("m1()");
	}
}*/

/*class FinallyEx1{
	public static void main(String[] args) {
		System.out.println("Exec Starts");
		m1();
		System.out.println("Exec ends");
	}
	static void m1(){
		System.out.println("m1()");
		try{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("ArithmeticException Handled");
		}
		finally{
			System.out.println("Hello finally");
		}
		System.out.println("m1()");
	}
}*/

/*class FinallyEx1{
	public static void main(String[] args) {
		System.out.println("Going to visit");
		try{
			System.out.println(10/0);
		}
		finally{
			System.out.println("I celebrated my sister's b'day even if my bike got punctured");
		}
		System.out.println("Visited");
	}
}*/