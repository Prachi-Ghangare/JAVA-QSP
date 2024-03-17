//Write a program that reads the balance and the annual percentage interest rate and display the interest for the next month.

import java.util.Scanner;

class CalcInterest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter balance:");
		float balance = sc.nextFloat();
		System.out.print("Enter interest rate:");
		float intRate = sc.nextFloat();
		float interest = balance*(intRate/1200);
		System.out.print("The interest is "+interest);
	}
}