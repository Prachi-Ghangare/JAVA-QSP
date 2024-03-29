//Emirp no - check num is prime if it is prime find reverse of no and check if rev & no both are prime or not .If both prime then it is emirp no otherwise not
import java.util.Scanner;
class EmirpNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++){
			if(num%i==0){
				count++;
				break;
			}
		}
		boolean flag = count==0?true:false;

		if(flag){
			int rev=0;
			while(num>0){
				int rem=num%10;
				rev =rev*10+rem;
				num/=10;
			}
			int count1=0;
			for(int i=2;i<rev;i++){
				if(rev%i==0){
					count1++;
					break;
				}
			}
			boolean flag1 = count1==0?true:false;

			if(flag && flag1)
				System.out.print("Emirp Number");
			else
				System.out.print("Not an Emirp Number");
		}
		else
			System.out.print("Not an Emirp Number");
	}
}