//Write a program that reads in investment amount, annual interest rate, and number of years, and display the future investment value. 

import java.util.Scanner;

class FutureInvestValue{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter investment amount:");
		float amt = sc.nextFloat();
		System.out.print("Enter annual interest rate percentage:");
		float intRate = sc.nextFloat();
		System.out.print("Enter number of years:");
		float noOfYears = sc.nextFloat();
		float accmValue = amt+(((amt/100)*intRate)*noOfYears);
		System.out.print("Accumulated value is $"+accmValue);
	}
}