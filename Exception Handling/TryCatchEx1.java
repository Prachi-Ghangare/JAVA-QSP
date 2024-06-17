class TryCatchEx1{
	public static void main(String[] args) {
		try{
			System.out.println("Hello from try");
			System.out.println(10/0.0); //infinity
		}
		catch(ArithmeticException ae){
			System.out.println("AE handled");
		}
	}
}

/*class TryCatchEx1{
	public static void main(String[] args) {
		System.out.println("Hi");
		try{
			System.out.println("Outer try");
			try{
				System.out.println("Inner try");
				System.out.println(10/0);
			}
			catch(NullPointerException npe){
				System.out.println("Inner catch");
			}
		}
		catch(ArithmeticException ae){
			System.out.println("Outer Catch 1");
		}
		catch(Exception e){
			System.out.println("Outer catch 2");
		}
	}
}
*/

/*class TryCatchEx1{
	public static void main(String[] args) {
		try{
			System.out.println("Hii from try");
			System.out.println(10/0);
			try{
				System.out.println("Inner try");
				System.out.println(10/0);
			}
			catch(NullPointerException npe){
				System.out.println("Inner catch");
			}
		}
		catch(ArithmeticException ae){
			System.out.println("Hi from outer catch");
		}
	}
}*/

/*class TryCatchEx1{
	public static void main(String[] args) {
		try{
			System.out.println("Hii from try");
			try{
				System.out.println("Inner try");
				System.out.println(10/0);
			}
			catch(NullPointerException npe){
				System.out.println("Inner catch");
			}
		}
		catch(ArithmeticException ae){
			System.out.println("Hi from outer catch");
		}
	}
}*/

/*class TryCatchEx1{
	public static void main(String[] args) {
		try{
			System.out.println("Outer try");
			try{
				System.out.println("Inner try");
				System.out.println(10/0);
			}
			catch(Exception e){
				System.out.println("Inner catch");
				System.out.println("Exception handled");
			}
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("AE handled");
		}	
	}
}*/

/*class TryCatchEx1{
	public static void main(String[] args) {
		try{
			System.out.println("Outer try");
			System.out.println(10/0);
			try{
				System.out.println("Inner try");
				System.out.println(10/0);
			}
			catch(Exception e){
				System.out.println("Inner catch");
				System.out.println("Exception handled");
			}
		}
		catch(ArithmeticException ae){
			System.out.println("AE handled");
		}	
	}
}*/

