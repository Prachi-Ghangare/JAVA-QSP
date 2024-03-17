//Write a program that reads an integer between 0 to 1000 and adds all the digit in the integer. For Example. if an integer is 932, the sum of all digits is 14.

import java.util.Scanner;

class SumOfDigits{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 0 to 1000:");
		int num = sc.nextInt();
		int sum = 0;
		sum = sum +num%10;
		num = num/10;
		sum = sum +num%10;
		num = num/10;
		sum = sum +num%10;
		System.out.print("Sum of Digits is:"+sum);	
	}
}