//Write a program that calculate the energy needed to heat water from an initial temperature to final temperature.Your program should prompt the user to enter the amount of water in kg and the initial and final temperature of the water. 

import java.util.Scanner;
class CalcEnergy{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms:");
		double water = sc.nextDouble();
		System.out.print("Enter the initial temperature:");
		double initTemp = sc.nextDouble();
		System.out.print("Enter the final Tempeature:");
		double finalTemp = sc.nextDouble();
		double energy = water*(finalTemp-initTemp)*4184;
		System.out.print("The energy needed is:"+energy);
	}
}