class ThrowEx{
	public static void main(String[] args) {
		throw new ArithmeticException("dividing num with 0 is not possible");
	}
}

/*class ThrowEx{
	public static void main(String[] args) {
		throw new ThrowEx(); //CTE:incompatible types
	}
}*/

/*class ThrowEx{
	public static void main(String[] args) {
		System.out.println("EXE STARTS");
		throw new ArithmeticException("ArithmeticException OCCURED EXPLICITLY");
		System.out.println("EXE ENDS");  //unreachable statement
	}
}*/

/*class ThrowEx{
	public static void main(String[] args) {
		System.out.println("Exe starts");
		try{
			throw new ArithmeticException("AE Occured explicitly");
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
		}
		System.out.println("Exe ends");
	}
}*/

/*class ThrowEx{
	public static void main(String[] args) {
		try{
			throw new InterruptedException("IE Occured explicitly"); //CTE
		}
		catch(ArithmeticException ae){
			System.out.println("AE Handled");
		}
	}
}*/

/*class ThrowEx{
	public static void main(String[] args) {
		System.out.println("Exe starts");
		try{
			throw new NullPointerException("npe thrown explicitly"); //CTE
		}
		catch(NullPointerException npe){
			npe.printStackTrace();
		}
		System.out.println("Exe ends");
	}
}*/