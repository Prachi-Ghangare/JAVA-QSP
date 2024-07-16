class NumPalindromeArr{
	public static void main(String[] args) {
		int [] arr = {121,11,123,234};
		for(int num:arr){
			if(isPalindrome(num)){
				System.out.print(num+" ");
			}
		}
	}
	public static boolean isPalindrome(int num) {
		int rev=0;
		int dup=num;
		for(int i=num;i!=0;i/=10){  
			int rem = i%10;  
			rev=rev*10+rem;
		}
		if(rev==dup)
			return true;
		else
			return false;
	}
}