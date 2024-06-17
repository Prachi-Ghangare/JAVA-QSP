/*class FinallyEx2{
	public static void main(String[] args) {
		System.out.println("Going to visit");
		try{
			for (; ; ) {
				System.out.println("I'm busy forever"); //infinite loop
			}
		}
		finally{  //will not execute
			System.out.println("I celebrated my sister's b'day even if my bike got punctured");
		}
	}
}*/

/*class FinallyEx2{
	public static void main(String[] args) {
		try{
			System.out.println("Outer try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("AE Handled outer catch 1");
			try{
				System.out.println("inner try");
				System.out.println(10/0);
			}
			catch(NullPointerException npe){
				System.out.println("NPE Handled inner catch");
			}
			finally{
				System.out.println("inner finally");
			}
		}
		finally{
			System.out.println("Outer finally");
		}
	}
}*/

/*class FinallyEx2{
	public static void main(String[] args) {
		try{
			System.out.println("Outer try");
			try{
				System.out.println("Inner try");
			}
			catch(NullPointerException npe){
				System.out.println("Inner catch");
			}
			finally{
				System.out.println("inner finally");
				System.out.println(10/0);
			}
		}
		catch(ArithmeticException ae){
			System.out.println("outer catch 1");
		}
		catch(Exception e){
			System.out.println("outer catch 2");
		}
		finally{
			System.out.println("outer finally");
		}
	}
}*/

/*class FinallyEx2{
	public static void main(String[] args) {
		System.out.println("EXEC STARTS");
		try{
			System.out.println("Hello try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("AE Handled");
			System.exit(0);
		}
		finally{
			System.out.println("Hello finally");
		}
		System.out.println("EXEC ENDS");
	}
}*/

class FinallyEx2{
	public static void main(String[] args) {
		System.out.println("EXEC STARTS");
		for(;;){
			System.out.println("Hello");
		}
		System.out.println(10/0);
	}
}