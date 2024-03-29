import java.util.Scanner;

class ArmstrongNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int len=0;
		int dup=num;
		int dup1=num;
		int sum=0;
		while(num>0){
			len++;
			num/=10;
		}
		while(dup>0){
			int rem=dup%10;
			int pow=1;
			for(int i=1;i<=len;i++){
				pow*=rem;
			}
			sum+=pow;
			dup/=10;
		}
		if(dup1==sum){
			System.out.print("It is an Armstrong Number");
		}else{
			System.out.print("It is not an Armstrong Number");
		}
	}
}