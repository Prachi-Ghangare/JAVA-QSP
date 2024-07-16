class StringPalindromeArr{
	public static void main(String[] args) {
		String [] arr = {"naman","nitin","ramesh"};
		for(String str:arr){
			if(isPalindrome(str))
				System.out.print(str+" ");
		}
	}
	public static boolean isPalindrome(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			rev+=str.charAt(i);
		}
		if(rev.equals(str))
			return true;
		else
			return false;
	}
}