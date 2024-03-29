import java.util.*;
class FibSeries{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int num1=0,num2=1;
		System.out.print(num1+" "+num2+" ");
		for(int i=1;i<=num;i++){
			int fib = num1+num2;
			System.out.print(fib+" ");
			num1=num2; 
			num2=fib; 
		}	
	}
}