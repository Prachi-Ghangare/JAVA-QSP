//Write a program that reads a number in feet, converts it to meters, and displays the result. One foot is 0.305 meter.

import java.util.Scanner;

class FeetToMeters{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for feet:");
		double feet = sc.nextDouble();
		double meters = feet*0.305;
		System.out.print(feet+" feet is "+meters+" meters");
	}
}