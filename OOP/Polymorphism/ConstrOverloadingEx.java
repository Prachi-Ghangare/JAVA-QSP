class ConstrOverloadingEx{
	ConstrOverloadingEx(){
		System.out.println("No arg constructor");
	}
	private ConstrOverloadingEx(int a){
		System.out.println("1 arg constructor");
	}
	public ConstrOverloadingEx(int a,int b){
		System.out.println("2 arg constructor");
	}
	public static void main(String[] args) {
		ConstrOverloadingEx obj = new ConstrOverloadingEx();
	}
}

/*class ConstrOverloadingEx{
	ConstrOverloadingEx(){
		System.out.println("No arg constructor");
	}
	private ConstrOverloadingEx(){ //CTE:constructor ConstrOverloadingEx() is already defined in class
		System.out.println("No arg constructor");
	}
}*/

/*class Ramesh{
	Ramesh(){
		System.out.println("Hi from Ramesh class");
	}
}

class Suresh extends Ramesh{
	Suresh(){
		System.out.println("Hi from Suresh class");
	}
	public static void m1() {
		System.out.println("Hi from m1()");
	}
	void ramesh(){ //it's a method not a constructor
		System.out.println("Hi from Ramesh in suresh class");
	}
}

class ConstrOverloadingEx{
	public static void main(String[] args) {
		Suresh obj = new Suresh();
	}
}*/