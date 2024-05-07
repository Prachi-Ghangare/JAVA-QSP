class Ramesh{
	Ramesh(){
		System.out.println("Hello from no arg const");
	}

	public Ramesh(int a){
		System.out.println("Hello from 1 arg const");
	}

	private Ramesh(int a,int b){
		System.out.println("Hello from 2 arg const");
	}

	protected Ramesh(int a,int b,int c){
		System.out.println("Hello from 3 arg const");
	}
}

class ParameterEx{
	public static void main(String[] args) {
		System.out.println("Hello from main");
		Ramesh obj1 = new Ramesh();
		Ramesh obj2 = new Ramesh(10);
		Ramesh obj3 = new Ramesh(10,20);
		Ramesh obj4 = new Ramesh(10,20,30);
	}
}