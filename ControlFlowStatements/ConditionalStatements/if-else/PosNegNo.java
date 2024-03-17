//Write a program to check if the number other than 0 is positive or negative(natural numbers)

import java.util.Scanner;

class PosNegNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		if(num>0){
			System.out.print(num+" is a positive number");
		}else{
			System.out.print(num+" is a negative number");
		}
	}
}