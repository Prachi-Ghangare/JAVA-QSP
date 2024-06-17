class CodePointAtMethod{
	public static void main(String[] args) {
		String str = "abcdef";
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i)+" : "+str.codePointAt(i));
		}
	}

	/*static String str= "Hello";
	public static void main(String[] args) {
		for(int i=0;i<str.length();i++){
 			System.out.print(userCharAt(i)+" ");
		}
	}
	public static int userCharAt(int indx) {
		if(indx<0 || indx>str.length()-1){
			throw new StringIndexOutOfBoundsException("Wrong index");
		}
		char [] arr= str.toCharArray();
		
		return (int)arr[indx];		
	}*/
}