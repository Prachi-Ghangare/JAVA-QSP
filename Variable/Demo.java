//String [] args is a array of type java.lang.String class & stores command line argument, also name of String array is args
//Command line argument are the argument pass at time of execution. we need to give arg after java filename while executing
//Primitve datatype cannot store null values
//Non-primitive can store null values

class Demo{
	public static void main(String [] args) {
		for (String elem:args) System.out.print(elem); //Command Line Argument 
		// const num = 10; //banned keyword gives CTE:illegal start of expression
		// System.out.print(num);
		// int a = null; //CTE:<null> cannot be converted to int
		// byte b = null;
		// short c = null;
		// long d = null;
		// float e = null;
		// double f = null; 
		// boolean g = null;
		// String str = null; //can store null values

		// System.out.print(a);
		// System.out.print(b);
		// System.out.print(c);
		// System.out.print(d);
		// System.out.print(e);
		// System.out.print(f);
		// System.out.print(g);
		// System.out.print(str);
	}
}