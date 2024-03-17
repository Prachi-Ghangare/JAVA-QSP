//Write a program that prompt the user to enter a weight in pounds and height in inches and displays the Body Mass Index.

import java.util.Scanner;
class CalcBmi{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in pounds:");
		float weight = sc.nextFloat(); // pounds
		System.out.print("Enter height in inches:");
		float height = sc.nextFloat(); // inches
		weight *= 0.45359237; // weight = weight*0.45359237 in km;
		height *= 0.0254; // in meters
		float bmi = weight / (height*height);
		System.out.print("BMI is "+bmi);
	}
}