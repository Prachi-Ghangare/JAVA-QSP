import java.util.Scanner;

class Palindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int rev=reverseNum(num);
		isPalindrome(num,rev);		
	}

	public static int reverseNum(int num){
		int rev=0;
		while(num>0){
			int rem=num%10;
			rev  = rev*10+rem;
			num/=10;
		}
		return rev;
	}

	public static void isPalindrome(int num,int rev){
		System.out.print((num==rev)?num+" is a Palindrome Number":num+" is Not a Palindrome Number");
	}
}