class FibSeries{
	static int num=10,num1=0,num2=1,i=1;
	public static void main(String[] args) {
		System.out.print(num1+" "+num2+" ");
		fibonacci();
	}
	public static void fibonacci() {
		if(i>8)  //base condition
			return;

		int fib = num1+num2;
		System.out.print(fib+" ");
		num1=num2; 
		num2=fib;

		i++;
		fibonacci();
	}
}