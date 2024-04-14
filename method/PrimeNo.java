//check whether number is prime or not using recursion

import java.util.Scanner;
class PrimeNo{
	static int num;
	static int i=2;
	static boolean flag=false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		num=sc.nextInt();
		isPrime();
		System.out.print(flag?"Prime":"Not Prime");
	}
	public static void isPrime() {
		if(i==num)  //base condition
			return ;
		if(num%i==0){
			flag=false;
			return ;
		}
		i++;
		isPrime();
	}
}