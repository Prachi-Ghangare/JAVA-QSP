import java.util.Scanner;
class KrishnamurthyNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int sum=0;
		int dup=num;
		while(num>0){ 
			int fact=1;
			int rem=num%10; 
			for(int i=1;i<=rem;i++){
				fact*=i;
			}
			sum+=fact;
			num/=10;
		}
		System.out.print((dup==sum)?"Krishnamurthy Number":"Not a Krishnamurthy Number");
	}
}