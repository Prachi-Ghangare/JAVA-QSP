/*class TryCatchEx2{
	public static void main(String[] args) {
		System.out.println("Hi");
		try{
			System.out.println("Outer try");
			try{
				String [] arr = new String[0];
				System.out.println(arr[1]); //ArrayIndexOutOfBoundsException
			}
			catch(ClassCastException cce){
				System.out.println("Inner catch");
			}
		}
		catch(ArithmeticException ae){
			System.out.println("Outer Catch 1");
		}
		catch(RuntimeException re){
			System.out.println("Outer catch 2");
		}
	}
}*/

/*class TryCatchEx2{
	public static void main(String[] args) {
		try{
			System.out.println("Outer try");
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			System.out.println("InterruptedException Handled");
		}
		catch(Exception e){
			System.out.println("Exception handled");
		}
		catch(RuntimeException re){   //CTE:exception RuntimeException has already been caught
			System.out.println("RuntimeException Handled");
		}
	}
}*/

class TryCatchEx2{
	public static void main(String[] args) {
		System.out.println("Hello starts");
		try{
			Thread.sleep(1000);
		}
		catch(RuntimeException re){   
			System.out.println("RuntimeException Handled");
		}
		catch(InterruptedException ie){
			System.out.println("InterruptedException Handled");
		}
		System.out.println("Hello ends");
	}
}
