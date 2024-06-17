class Demo{
	int a=420;
}

class Driver{
	static Demo d;
	public static void main(String[] args) throws ArithmeticException,NullPointerException {
		System.out.println("Main starts");
		try{
			m1();
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
			try{
				System.out.println(d.a);
			}
			catch(NullPointerException npe){
				npe.printStackTrace();
			}
		}
		System.out.println("Main ends");
	}

	static void m1(){
		System.out.println(10/0);
	}
}