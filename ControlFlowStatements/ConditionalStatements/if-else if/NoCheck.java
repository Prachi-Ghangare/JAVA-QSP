//Write a program to check whether user entered number is positive,negative or neutral number(natural number)

import java.util.Scanner;

class NoCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any natural number:");
		if(num==0){
			System.out.print(num+" is a neutral number");
		}
		else if(num>0){
			System.out.print(num+" is a positive number");
		}
		else if(num<0){
			System.out.print(num+" is a negative number");
		}
		else{
			System.out.print("Enter the valid input");
		}
	}
}