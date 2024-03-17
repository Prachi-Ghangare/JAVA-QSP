class IntExample{
	public static void main(String[] args) {
		int a = 2147483647;
		int b = -2147483648;
		System.out.print(a+b); // -1 goes in -ve end

		// int c = 'c';
		// System.out.print(c); // 99

		// int a = -128;
		// a = a-1;
		// System.out.print(a); // -129

		// int a = 128;
		// a += 1;
		// System.out.print(a); // 129 explicitly(forcefully) adds 1
	}
}