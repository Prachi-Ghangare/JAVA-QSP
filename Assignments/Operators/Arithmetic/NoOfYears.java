//Write a program that prompt the user to enter the min (e.g 1 billion) and display the number of years and days for the min.For simplicity, assume a year has 365 days.

import java.util.Scanner;

class NoOfYears{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of minutes :");
		double min = sc.nextDouble();
		double years = min / (365 * 24 * 60);
		double days = (int)(min / 60/24)%365;
		System.out.println(min+" is approximately "+years+" years and "+days+" days");
		}
}