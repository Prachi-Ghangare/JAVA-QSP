import java.util.Scanner;
class Palindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int rev=0;
		int dup=num;
		while(num>0){
			int rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
		System.out.print((dup==rev)?"It's a Palindrome Number":"It's not a Palindrome Number");
	}
}