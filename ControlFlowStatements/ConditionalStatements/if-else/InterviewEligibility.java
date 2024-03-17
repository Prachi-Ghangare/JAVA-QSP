//Write a program to check if user entered percentage is eligible for appearing interview or not .If the percentage is above 60 the student is eligible and if percentage is below 60 the student is not eligible.

import java.util.Scanner;

class InterviewEligibility{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your percentage:");
		double percentage = sc.nextDouble();
		if(percentage>60){
			System.out.print("you are eligible for interview");
		}else{
			System.out.print("you are not eligible for interview");
		}
	}
}