import java.util.Scanner;

class PerfectSqr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		boolean flag=false;
		int sqrt=0;
		for(int i=1;i<=num/2;i++){
			if(i*i==num){
				flag=true;
				sqrt=i;
				break;
			}
		}
		if(flag)
			System.out.print(sqrt+" is a perfect square root of "+num);
		else
			System.out.print(num+" don't have a perfect Square Root");
	}
}