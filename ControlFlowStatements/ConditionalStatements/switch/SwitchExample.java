class SwitchExample{
	public static void main(String[] args) {

		//Syntax
		/*
		switch(var/exp/literal)
		{
			case label1 : //statement
			case label2 : //statement
			default : //statement 
		}
		*/

		int a = 10;
		switch(a)
		{
			case 1 : System.out.println("Hi from case 1");break;
			case 2 : System.out.println("Hi from case 2");break;
			case 3 : System.out.println("Hi from case 3");break;
			default : System.out.println("Default Block");break;
		}

		/*
		int a = 1;
		switch(a)
		{
			case 1 : System.out.println("Hi from case 1");
			case 2 : System.out.println("Hi from case 2");
			case 3 : System.out.println("Hi from case 3");
			default : System.out.println("Default Block");
		}
		*/

		/*
		byte a = 1;
		switch(a+0)
		{
			case 1 : System.out.println("Hi from case 1");break;
			case 'b' : System.out.println("Hi from case 'b'");break;
			case "B" : System.out.println("Hi from case string ");break; // String cannot be converted to int
			default : System.out.println("Default Block");break;
		}
		*/

		/*
		byte a = 1;
		switch(a+0)
		{
			case 1 : System.out.println("Hi from case 1");break;
			case 2 : System.out.println("Hi from case 2");break;
			case 3 : System.out.println("Hi from case 3");break;
			case 128 : System.out.println("Hi from case 3");break;
			default : System.out.println("Default Block");break;
		}
		*/

		/*
		byte a = 1;
		switch(a)
		{
			case 1 : System.out.println("Hi from case 1");break;
			case 2 : System.out.println("Hi from case 2");break;
			case 3 : System.out.println("Hi from case 3");break;
			case 128 : System.out.println("Hi from case 3");break; //incompatible types: possible lossy conversion from int to byte
			default : System.out.println("Default Block");break;
		}
		*/

		/*
		byte a = 1;
		switch(a+1)
		{
			case 1 : System.out.println("Hi from case 1");break;
			case 'b' : System.out.println("Hi from case 'b'");break;
			case 'c' : System.out.println("Hi from case 'c'");break;
			default : System.out.println("Default Block");break;
		}
		*/

		/*
		byte a = 1;
		switch(a+1)
		{
			case 1 : System.out.println("Hi from case 1");break;
			default : System.out.println("Default Block");
			case 'b' : System.out.println("Hi from case 'b'");break;
			case 'c' : System.out.println("Hi from case 'c'");break;
		}
		*/	

		/*
		byte a = 1;
		switch(a+1)
		{
			case 1 : System.out.println("Hi from case 1");break;break; //unreachable statement
			default : System.out.println("Default Block");
			case 'b' : System.out.println("Hi from case 'b'");break;
			case 'c' : System.out.println("Hi from case 'c'");break;
		}
		*/

		/*
		byte a = 1;
		switch(a+1)
		{
			case 1 : System.out.println("Hi from case 1");break;
			case 'b' : System.out.println("Hi from case 'b'");break;
			case 'c' : System.out.println("Hi from case 'c'");break;
		}
		*/

		/*
		byte a = 1;
		switch(a+0)
		{
			case 1 : System.out.println("Hi from case 1");break;
			case 2 : System.out.println("Hi from case 2");break;
			case 'A' : System.out.println("Hi from case 'A'");break;
			case 65 : System.out.println("Hi from case 2");break; // duplicate case label
			case 128 : System.out.println("Hi from case 2");break;
			default : System.out.println("Default Block");break;
		}
		*/

		/*
		byte a = 1;
		switch(a)
		{
			//not recommended
		}
		*/

		/*
		char ch = 'a';
		switch(ch)
		{
			case ch : System.out.print("Hell World"); //CTE: constant expression required
		}
		*/

		/*
		double a = 1.1;
		switch(a)	//selector type double is not allowed
		{
			// Statement
		}
		*/

		/*
		float a = 1.1;
		switch(a)	//selector type float is not allowed
		{
			// Statement
		}
		*/

		/*
		long a = 10l;
		switch(a)	//selector type long is not allowed
		{
			// Statement
		}
		*/
	}
}