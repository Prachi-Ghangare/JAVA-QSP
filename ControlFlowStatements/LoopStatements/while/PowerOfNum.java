import java.util.Scanner;
class PowerOfNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int len=0;
		int dup=num;
		int pow=1;
		while(num>0){
			len++;
			num/=10;
		}
		for(int i=1;i<=len;i++){
			pow*=dup;
		}
		System.out.print("Power of Number is:"+pow);	
	}
}