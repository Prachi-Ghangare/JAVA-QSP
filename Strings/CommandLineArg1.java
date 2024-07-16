class CommandLineArg1{
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if(isPalindrome(num))
			System.out.println(num+" is a palindrome number");
		else
			System.out.println(num+" is not a palindrome number");
	}
	public static boolean isPalindrome(int num) {
		int rev=0;
		int dup=num;
		while(num!=0){
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(rev==dup)
			return true;
		return false;
	}
}