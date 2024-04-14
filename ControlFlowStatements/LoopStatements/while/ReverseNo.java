import java.util.Scanner;
class ReverseNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		int rev=0;
		while(num>0){
			int rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
		System.out.print("The reverse of a number is "+rev);
			

		//In case of number ending with 0
		/*int num = sc.nextInt();
		String rev="";
		while(num>0){
			int rem=num%10;
			rev=rev+rem;
			num/=10;
		}
		System.out.print("The reverse of a number is "+rev);*/	
	}
}