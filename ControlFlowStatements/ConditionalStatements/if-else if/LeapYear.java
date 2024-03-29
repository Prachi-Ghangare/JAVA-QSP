//Write a program to check whether user entered year is leap year or not

import java.util.Scanner;

class LeapYear{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year:");
		int year=sc.nextInt();
		if(year%400==0){
			System.out.print("It's a Leap Year");
		}
		else if(year%100!=0 && year%4==0){
			System.out.print("It's a Leap Year");
		}
		else
			System.out.print("It's not a Leap Year");
	}
}