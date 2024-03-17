//Write a program that converts pounds into kg.The program prompts the user to enter a number in pounds,converts it to kg,and displays the result.One pound is 0.454 kg.

import java.util.Scanner;

class PoundsToKg{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number in pound:");
		double pounds = sc.nextDouble();
		double kg = pounds * 0.454;
		System.out.print(pounds+" pounds is "+kg+" kilograms");
	}
}