class WideningEx{
	public static void main(String[] args) {
		byte a = 1;
		short b = a;
		int c = a;
		long d = a;
		float e = a;
		double f = a;
		char g = a; //CTE: possible lossy conversion from byte to char

		/*
		short a = 1;
		byte b = a; // possible lossy conversion from short to byte
		int c = a;
		long d = a;
		float e = a;
		double f = a;
		char g = a; //CTE: possible lossy conversion from short to char
		*/

		/*
		int a = 1;
		byte b = a; // possible lossy conversion from int to byte
		short c = a; // possible lossy conversion from int to short
		long d = a;
		float e = a;
		double f = a;
		char g = a; //CTE: possible lossy conversion from int to char
		*/

		/*
		long a = 1l;
		byte b = a; //CTE: possible lossy conversion from long to byte
		short c = a; //CTE: possible lossy conversion from long to short
		int d = a; //CTE:possible lossy conversion from long to int
		float e = a;
		double f = a;
		char g = a; //CTE: possible lossy conversion from long to char
		*/

		/*
		float a = 1f;
		byte b = a; //CTE: possible lossy conversion from float to byte
		short c = a; //CTE: possible lossy conversion from float to short
		int d = a; //CTE:possible lossy conversion from  float to int
		long e = a; //CTE:possible lossy conversion from float to long
		double f = a;
		char g = a; //CTE: possible lossy conversion from  to float char
		*/

		/*
		double a = 1f;
		byte b = a; //CTE: possible lossy conversion from double to byte
		short c = a; //CTE: possible lossy conversion from double to short
		int d = a; //CTE:possible lossy conversion from double to int
		long e = a; //CTE:possible lossy conversion from double to long
		float f = a;//CTE:possible lossy conversion from double to float
		char g = a; //CTE: possible lossy conversion from  to double char
		*/

		/*
		char a = 'a';
		short b = a; //CTE: possible lossy conversion from char to short
		int c = a; 
		long d = a;
		float e = a;
		double f = a;
		byte g = a;	//CTE: possible lossy conversion from char to byte
		*/	
	}
}