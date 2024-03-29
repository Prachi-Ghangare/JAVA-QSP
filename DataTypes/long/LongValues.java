class LongValues
{
	public static void main(String [] args)
	{
		// int a = 12345678901; //CTE:Integer number too large
		// int b = 12345678901L; //CTE: Poossible lossy conversion from long to int
		// long c = 1234567890; //we can store int in long but can't store long in int
		// long d = 12345678901l; //we can store because of l .
		// long e = 1234567890129057819l; //we can store upto 19 digit no.
		// long f = 12345678901290578190L; //CTE:integer number too large
		// System.out.println(b);
		// long max = 9223372036854775807l
		// long min = -9223372036854775808L
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}
}