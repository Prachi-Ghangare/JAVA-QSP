class MultipleCatchEx{
	public static void main(String[] args) {
		System.out.println("Hi");
		try{
			System.out.println("Outer try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("Outer Catch 1");
			try{
				System.out.println("Inner try");
				System.out.println(10/0);
			}
			catch(NullPointerException npe){
				System.out.println("Inner catch");
			}
		}
		catch(Exception e){
			System.out.println("Outer catch 2");
		}
	}
}