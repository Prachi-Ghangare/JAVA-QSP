class Demo{
	void m1(){
		System.out.println("Hello from m1()");
	}
}

class NPEExample{
	static Demo d;
	public static void main(String[] args) {
		System.out.println("Main Starts");
		try{
			d.m1();
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("m1() cannot ne accessed");
		}
		System.out.println("Main ends");
	}
}