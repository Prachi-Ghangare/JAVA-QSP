class CodePointCount{
	static String str= "ABCDEF";
	public static void main(String[] args) {
		// int indx1=userCodePointBefore(0);
		// System.out.println(str+" : "+indx1);
		int indx2=userCodePointCount(-3,-3);
		System.out.println(str+" : "+indx2);
	}
	public static int userCodePointCount(int startIndx,int endIndx) {
		if(startIndx>endIndx || startIndx<0 || startIndx>str.length() || endIndx<0 || endIndx>str.length()){
			throw new StringIndexOutOfBoundsException("Wrong index: "+"["+startIndx+","+endIndx+"]");
		}
		
		return endIndx-startIndx;		
	}
}