class CommandLineArg{
	public static void main(String[] args) {
		/*int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int add = num1+num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("Addition is : "+add);*/

		String str = args[0];
		String op = reverse(str);
		System.out.println(op);
	}

	public static String reverse(String str) {
		String rev ="";
		for (int i=str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			rev+=ch;
		}
		return rev;
	}
}