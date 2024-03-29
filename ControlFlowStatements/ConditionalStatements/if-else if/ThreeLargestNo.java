//Write a program to print the largest no among user entered three number

import java.util.Scanner;
class ThreeLargestNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1:");
		int num1 = sc.nextInt();
		System.out.print("Enter num2:");
		int num2 = sc.nextInt();
		System.out.print("Enter num3:");
		int num3 = sc.nextInt();
		if(num1>num2 && num1>num3)
			System.out.print("The Greatest number is:"+num1);
		else if(num2>num1 && num2>num3)
			System.out.print("The Greatest number is:"+num2);
		else
			System.out.print("The Greatest number is:"+num3);
	}
}