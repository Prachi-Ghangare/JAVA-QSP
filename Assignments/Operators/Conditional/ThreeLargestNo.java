//Write a program to display largest no. among the given three numbers

import java.util.*;

class ThreeLargestNo{
	public static void main(String[] args) {
		//(cond)?op1:op2 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num1:");
		int num1 = sc.nextInt(); 
		System.out.print("Enter a num2:");
		int num2 = sc.nextInt(); 
		System.out.print("Enter a num3:");
		int num3 = sc.nextInt();
		System.out.print((num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3));
		System.out.print(a[i]);
	}
}