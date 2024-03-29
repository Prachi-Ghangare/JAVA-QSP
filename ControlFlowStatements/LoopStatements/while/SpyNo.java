import java.util.*;
class SpyNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int sum=0,prod=1;
		int dup=num;
		while(num>0){
			int rem =num%10;
			sum+=rem;
			prod*=rem;
			num/=10;
		}
		if(sum==prod)
			System.out.print(dup+" is a Spy Number ");
		else
			System.out.print(dup+" is not a Spy Number");
	}
}