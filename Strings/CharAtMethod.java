class CharAtMethod{
	public static void main(String[] args) {
		String str = new String("Hello");
		System.out.println(str.charAt(0));		//H
		System.out.println(str.charAt(1));		//E
		System.out.println(str.charAt(-1));		//SIOBE
		System.out.println(str.length());		//SIOBE
		System.out.println(str.length()-1);		//O
	}

	/*static String str= "Hello";
	public static void main(String[] args) {
		for(int i=0;i<str.length();i++){
 			System.out.print(userCharAt(i)+" ");
		}
	}
	public static char userCharAt(int indx) {
		if(indx<0 || indx>str.length()-1){
			throw new StringIndexOutOfBoundsException("Wrong index");
		}
		char [] arr= str.toCharArray();
		
		return arr[indx];		
	}*/
}