class NoArgsConstEx{
	NoArgsConstEx(){
		System.out.println("Hii from no argument constructer");
	}
	public static void main(String[] args) {
		NoArgsConstEx obj = new NoArgsConstEx();
	}
}

/*class NoArgsConstEx{
	NoArgsConstEx(){
		super(); //default provided by compiler
		System.out.println("Hii from no argument constructer");
	}
	public static void main(String[] args) {
		NoArgsConstEx obj = new NoArgsConstEx();
	}
}*/

/*class NoArgsConstEx{
	NoArgsConstEx(){
		this(); //CTE:recursive constructor invocation i.e this call same constr again and again
		System.out.println("Hii from no argument constructer");
	}
	public static void main(String[] args) {
		NoArgsConstEx obj = new NoArgsConstEx();
	}
}*/

/*class NoArgsConstEx{
	NoArgsConstEx(){
		super();
		this(10); //CTE: call to this must be first statement in constructor
		System.out.println("Hii from no argument constructer");
	}
	NoArgsConstEx(int a){
		System.out.println("Hii from 1 argument constructer");
		System.out.println(a);
	}
	public static void main(String[] args) {
		NoArgsConstEx obj = new NoArgsConstEx();
	}
}*/

/*class NoArgsConstEx{
	NoArgsConstEx(){
		this(10); 
		super(); //CTE:call to super must be first statement in constructor
		System.out.println("Hii from no argument constructer");
	}
	NoArgsConstEx(int a){
		System.out.println("Hii from 1 argument constructer");
		System.out.println(a);
	}
	public static void main(String[] args) {
		NoArgsConstEx obj = new NoArgsConstEx();
	}
}*/

/*class NoArgsConstEx{
	NoArgsConstEx(){
		this(10); 
		System.out.println("Hii from no argument constructer");
	}
	NoArgsConstEx(int a){
		System.out.println("Hii from 1 argument constructer");
		System.out.println(a);
	}
	public static void main(String[] args) {
		NoArgsConstEx obj = new NoArgsConstEx();
	}
}*/