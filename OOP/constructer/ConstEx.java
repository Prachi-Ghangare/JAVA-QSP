class ConstEx{
	//default constructer provided by compiler
	// ConstEx(){
	// 	super();
	// }
	public static void main(String[] args) {
		System.out.println("Hello from main");
		System.out.println("Hello from default constructer");
	}
}

/*class ConstEx{
	//no argument constructer
	ConstEx(){
		// super(); //compiler provided
		System.out.println("Hello from no arg constructer");
	}
	public static void main(String[] args) {
		System.out.println("Hello from main");
		ConstEx obj = new ConstEx();
	}
}*/

/*class ConstEx{
	ConstEx(int a){
		// super(); //compile provided
		System.out.println("Hello from parameterized constructer");
		System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println("Hello from main");
		ConstEx obj = new ConstEx(10);
	}
}*/