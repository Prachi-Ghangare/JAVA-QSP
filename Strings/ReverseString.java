class ReverseString{
	public static void main(String[] args) {
		String str = "qspiders training institute";
		String [] words = str.split(" ");
		String op ="";
		for(String s : words) {
		 	String rev = (new StringBuffer(s).reverse()).toString();
		 	op=op+rev+" ";
		 } 
		 System.out.println(op);
	}
}