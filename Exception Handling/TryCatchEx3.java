/*class TryCatchEx3{
	static TryCatchEx3 t;
	int a = 45;
	public static void main(String[] args) {
		System.out.println("main starts");
		try{
			System.out.println("neeta is very good girl");
		}
		catch(ArithmeticException e1){
			e1.printStackTrace();
			try{
				System.out.println(t.a);
			}
			catch(Exception e2){
				e2.printStackTrace();
			}
		}
		catch(Exception e3){
			System.out.println("Outer catch 2");
		}
		System.out.println("main ends");
	}
}*/

/*class TryCatchEx3{
	static TryCatchEx3 t;
	int a = 45;
	public static void main(String[] args) {
		System.out.println("main starts");
		try{
			System.out.println(10/0);
		}
		catch(Exception e1){
			e1.printStackTrace();
			try{
				System.out.println(t.a);
			}
			catch(NullPointerException e2){
				e2.printStackTrace();
			}
		}
		System.out.println("main ends");
	}
}*/

class TryCatchEx3{
	public static void main(String[] args) {
		System.out.println("main starts");
		try{
			System.out.println("Hello from try");
			String str=null;
			System.out.println(str.isEmpty());
		}
		catch(ArithmeticException e1){
			e1.printStackTrace();
		}
		// catch(RuntimeException e2){
		// 	e2.printStackTrace();
		// }
		catch(NullPointerException npe){
			System.out.println("NullPointerException Handled");
		}
		System.out.println("main ends");
	}
}