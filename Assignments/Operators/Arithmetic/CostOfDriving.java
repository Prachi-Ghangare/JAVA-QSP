//Write a program that prompt the user to enter the distance to drive, the fuel efficiency of the car in miles per gallon , and the price per gallon, and display the cost of the trip.

import java.util.Scanner;
class CostOfDriving{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the driving distance:");
		float distance = sc.nextFloat();
		System.out.print("Enter the fuel efficiency in miles per gallon:");
		float fuel = sc.nextFloat();
		System.out.print("Enter the price per gallon:");
		float price = sc.nextFloat();
		float cost = (distance/fuel)*price;
		System.out.print("The cost of driving is $"+cost);
	}
}