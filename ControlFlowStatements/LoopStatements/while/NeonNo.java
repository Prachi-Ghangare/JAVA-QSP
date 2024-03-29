import java.util.Scanner;
class NeonNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int sqr = num*num;
		int sum=0;
		while(sqr>0){
			int rem=sqr%10;
			sum+=rem;
			sqr/=10;
		}
		System.out.print((sum==num)?num+" is a Neon Number":num+"  is not a neon number");
	}
}