class FinallyEx3{
	public static void main(String[] args) {
		System.out.println("EXEC STARTS");
		int i=1;
		while(i<=10);
		{
			System.out.println(i);
			i++;
		}
		try{
			System.out.println("hello try");
			System.out.println(10/0);
		}
		finally{
			System.out.println("hello from finally");
		}
	}
}

/*class FinallyEx3{
	public static void main(String[] args) {
		System.out.println("EXEC STARTS");
		try{
			Thread.currentThread().join();
		}
		catch(InterruptedException ie){
			System.out.println("InterruptedException Handled");
		}
		finally{
			System.out.println("Hello from finally");
		}
		System.out.println("EXEC ENDS");
	}
}*/

/*class FinallyEx3{
	public static void main(String[] args) {
		System.out.println("EXEC STARTS");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			System.out.println("InterruptedException Handled");
		}
		finally{
			System.out.println("Hello from finally");
		}
		System.out.println("EXEC ENDS");
	}
}*/

/*class FinallyEx3{
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
				try{
					System.out.println(10/0);
				}
				catch(ArithmeticException npe){
					System.out.println("Catch in finally");
				}
			}
		}
		catch(Exception e){
			System.out.println("Outer catch");
		}
		finally{
			System.out.println("hello from outer finally");
		}
	}
}*/