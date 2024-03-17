//Write a program to check whether a char is digit or not.

import java.util.Scanner;

class Digit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character:");
		char ch = sc.next().charAt(0);
		System.out.print((ch >= 48 && ch <= 57)?ch+" is a Digit":ch+" is not a Digit");
	}
}