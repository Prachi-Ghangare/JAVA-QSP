//Write a program to display the result of student 

import java.util.Scanner;

class StudentResult{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your percentage:");
		double percentage = sc.nextDouble();
		if(percentage>=90 && percentage<=100){
			System.out.println("You have cleared your exam with First Class with distiction and having grade O");
		}
		else if(percentage>=75 && percentage<90){
			System.out.println("You have cleared your exam with Distiction and having grade A+");
		}
		else if(percentage>=60 && percentage<75){
			System.out.println("You have cleared your exam with First class and having grade A");
		}
		else if(percentage>=35 && percentage<60){
			System.out.println("You have cleared your exam with Second class and having grade B");
		}
		else if(percentage<35){
			System.out.println("You have Failed in your exam");
		}
		else{
			System.out.println("Invalid Input");
		}
		System.out.println(percentage+"%");
	}
}