class IntValues{
	public static void main(String [] args)
	{
		// int a = 2147483647; //we can store
		// a =a + 1;//can add gives -2147483648 i.e starts from -ve end
		// int a = 2147483648; //CTE:integer number too large i.e.can't store exceeding capacity.
		// int a = -2147483649;//CTE:integer number too large
		//  System.out.println(a);
		// int b = -2147483648;
		// b = b-1; //gives 2147483647
		// b = b+1; //gives -2147483647
		//  System.out.println(b);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}