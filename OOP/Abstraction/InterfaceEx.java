interface Arithmetic{
	int add(int a,int b);
	int multi(int a,int b);
}

class ArithmeticImplementation implements Arithmetic{
	public int add(int a,int b){
		return a+b;
	}
	public int multi(int a,int b){
		return a*b;
	}
}

class InterfaceEx{
	public static void main(String[] args) {
		ArithmeticImplementation obj = new ArithmeticImplementation();
		System.out.println("Addition is:"+obj.add(10,20));
		System.out.println("Multiplication is:"+obj.multi(10,20));
	}
}