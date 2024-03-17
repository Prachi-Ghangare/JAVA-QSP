//Write a program whether user enter number is even or odd

import java.util.Scanner;

class EvenOdd{
	public static void main(String[] args) {
		// (cond)?op1:op2 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		System.out.print((num%2==0)?num+" Number is Even":num+" Number is Odd");
	}
}