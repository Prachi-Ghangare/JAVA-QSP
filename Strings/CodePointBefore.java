class CodePointBefore{
	static String str= "ABCDEF";
	public static void main(String[] args) {
		// int indx1=userCodePointBefore(0);
		// System.out.println(str+" : "+indx1);
		int indx2=userCodePointBefore(str.length());
		System.out.println(str+" : "+indx2);
	}
	public static int userCodePointBefore(int indx) {
		if(indx<1 || indx>str.length()){
			throw new StringIndexOutOfBoundsException("Wrong index: "+indx);
		}
		
		return str.charAt(indx-1);		
	}
}