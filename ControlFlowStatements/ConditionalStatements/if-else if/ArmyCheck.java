//Write a program to check whether the person is able to join army or not .Person age should be more than 18+ and height should be at least 162 cm and weight must be more than 56 kg 

import java.util.Scanner;

class ArmyCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age:");
		int age = sc.nextInt();
		if(age>18){
			System.out.print("Enter your height(cm):");
			double height = sc.nextDouble();
			if(height>=162){
				System.out.print("Enter your weight(kg):");
				double weight = sc.nextDouble();
				if(weight>56){
					System.out.print("You can join the army");
				}
				else{
					System.out.print("You cannot join army.Check the Requirements to join");
				}
			}
			else{
				System.out.print("You cannot join army.Check the Requirements to join");
			}
		}
		else{
			System.out.print("You cannot join army.Check the Requirements to join");
		}
	}
}