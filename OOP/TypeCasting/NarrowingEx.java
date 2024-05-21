class NarrowingEx{
	public static void main(String[] args) {
		byte a = 1;
		short b = a;
		int c = a;
		long d = a;
		float e = a;
		double f = a;
		char g =(char)a; 

		/*
		short a = 1;
		byte b = (byte)a; 
		int c = a;
		long d = a;
		float e = a;
		double f = a;
		char g = (char)a; 
		*/

		/*
		int a = 1;
		byte b = (byte)a; 
		short c = (short)a; 
		long d = a;
		float e = a;
		double f = a;
		char g = (char)a; 
		*/

		/*
		long a = 1l;
		byte b = a; 
		short c = a; 
		int d = a; 
		float e = a;
		double f = a;
		char g = a; 
		*/

		/*
		float a = 1f;
		byte b = (byte)a; 
		short c = (short)a; 
		int d = (int)a; 
		long e = (long)a; 
		double f = a;
		char g = (char)a; 
		*/

		/*
		double a = 1f;
		byte b = (byte)a; 
		short c = (short)a; 
		int d = (int)a; 
		long e = (long)a; 
		float f = (float)a;
		char g = (char)a; 
		*/

		/*
		char a = 'a';
		short b = (short)a; 
		int c = a; 
		long d = a;
		float e = a;
		double f = a;
		byte g = (byte)a;
		*/
	}
}