class LengthOfStr{
	public static void main(String[] args) {
		String str = new String("Hello");
		String str1="World";
		System.out.println(str.length());
		System.out.println(str.length());
	}

	/*static String str="Hello";
	public static void main(String[] args) {
		int length=userLength();
		System.out.println(length);
	}
	public static int userLength() {
		int len=0;
		for (int i=0; ;i++ ) {
			try{
				str.charAt(i);
				len++;
			}
			catch(StringIndexOutOfBoundsException se){
				break;
			}
		}
		return len;
	}*/

	/*public static void main(String[] args) {
		String str="Hello";
		int length=userLength(str);
		System.out.println(length);
	}
	public static int userLength(String str) {
		int len=0;
		for (int i=0; ;i++ ) {
			try{
				str.charAt(i);
				len++;
			}
			catch(StringIndexOutOfBoundsException se){
				break;
			}
		}
		return len;
	}*/
}