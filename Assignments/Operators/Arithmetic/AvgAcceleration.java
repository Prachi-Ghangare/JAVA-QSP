//Write a program that prompt the user to enter the starting velocity v0 in m/s, the ending velocity v1 in m/s, and the time span t in sec, and displays the average acceleration

import java.util.Scanner;

class AvgAcceleration{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter v0, v1, and t:");
		float v0 = sc.nextFloat();
		float v1 = sc.nextFloat();
		float t = sc.nextFloat();
		float avgAccl = (v1 - v0)/t;
		System.out.print("The average acceleration is "+avgAccl);
	}
}