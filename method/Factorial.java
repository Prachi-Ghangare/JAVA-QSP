//print the factorial of a number using recursion

import java.util.Scanner;
class Factorial{
	static int num;
	static int fact = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		num=sc.nextInt();
		fact();
		System.out.print(fact);
	}
	public static void fact() {
		fact = fact*num;
		num--;
		if(num==0)
			return ;
		fact();
	}
}