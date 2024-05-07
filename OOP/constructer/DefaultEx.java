class DefaultEx{
	//compiler provided
	// DefaultEx(){

	// }
	public static void main(String[] args) {
		DefaultEx obj = new DefaultEx();
	}
}

/*class Ramesh{
	//super(); //will call object class const
	//default const
}

class Suresh extends Ramesh{
	//super(); //will call ramesh const
	//default const
}

class DefaultEx{
	public static void main(String[] args) {
		Suresh obj = new Suresh();
	}
}*/

/*class Ramesh{
	//super(); //will call object class const
	Ramesh(){
		System.out.println("Hello from no arg const of Ramesh class");
	}
}

class Suresh extends Ramesh{
	//super(); //will call ramesh const
	Suresh(){
		System.out.println("Hello from no arg const of Suresh class");
	}
}

class DefaultEx{
	public static void main(String[] args) {
		System.out.println("Hello from main");
		Suresh obj = new Suresh();
	}
}*/

/*public class DefaultEx{
	//default constructer
	// DefaultEx(){
	// 	super();
	// }
	public static void main(String[] args) {
		DefaultEx obj = new DefaultEx();
	}
}*/ 

/*private class DefaultEx{ //CTE:modifier private not allowed here i.e.top level class cannot be private
	private DefaultEx(){ //default const inherits access modifier of top level class so default also cannot be private
		// super();
	}
	public static void main(String[] args) {
		DefaultEx obj = new DefaultEx();
	}
}*/

/*protected class DefaultEx{ //CTE:modifier protected not allowed here i.e.top level class cannot be protected
	protected DefaultEx(){ //default const inherits access modifier of top level class so default also cannot be protected
		// super();
	}
	public static void main(String[] args) {
		DefaultEx obj = new DefaultEx();
	}
}*/

/*class DefaultEx{ //no modifier means default
	DefaultEx(){ //class is default so default
		// super();
	}
	public static void main(String[] args) {
		DefaultEx obj = new DefaultEx();
	}
}*/