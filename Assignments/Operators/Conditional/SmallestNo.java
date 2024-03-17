// Write a program to display smallest no. among the given two numbers

import java.util.Scanner;

class SmallestNo{
	public static void main(String[] args) {
		// (cond)?op1:op2 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num1:");
		int num1 = sc.nextInt(); 
		System.out.print("Enter a num2:");
		int num2 = sc.nextInt();
		int min = (num1>num2)?num2:num1;
		System.out.print("Smallest among the numbers "+num1+" , "+num2+" is "+min);
	}
}