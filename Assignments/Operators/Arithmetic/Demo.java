class Demo{
	public static void main(String[] args) {
		// byte a = 1;
		// byte b = 2;
		// byte c = a+b; //CTE: possible lossy conversion from int to byte
		// int c = a+b;
		// long c = a+b;

		int a = 2147483647;
		int b = -2147483648;
		// byte c = a+b; //CTE: possible lossy conversion from int to byte
		// int c = a+b;
		// System.out.print(c); // -1
	}
}