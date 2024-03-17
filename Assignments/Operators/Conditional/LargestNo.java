//Write a program to display largest no. among the given two numbers 

import java.util.Scanner;

class LargestNo{
	public static void main(String[] args) {
		// (cond)?op1:op2 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num1:");
		int num1 = sc.nextInt(); 
		System.out.print("Enter a num2:");
		int num2 = sc.nextInt(); 
		int max = (num2>num1)?num2:num1;
		System.out.print("largest among the numbers "+num1+" , "+num2+" is "+max);
	}
}