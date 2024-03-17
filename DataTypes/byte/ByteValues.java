class ByteValues
{
	public static void main(String [] args)
	{
		// byte a = 127; //CTE:possible lossy conversion from int to byte i.e Exceeds range
		// a = a+1; //CTE:possible lossy conversion from int to byte
		// a += 1; //can add gives -128 i.e starts from -ve end
		// System.out.println(a);
		// byte b = -128;
		// b = b+1;//CTE:possible lossy conversion from int to byte
		// b += 1; //can add gives -127
		// System.out.println(b);
		// byte max = 127
		// byte min = -128
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
	}
}