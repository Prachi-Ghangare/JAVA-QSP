//Write a program to perform arithmetic operation on two numbers.

import java.util.Scanner;

class Calculator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num 1: ");
		double num1=sc.nextDouble();
		System.out.print("Enter operator:");
		char op = sc.next().charAt(0);
		System.out.print("Enter  num 2: ");
		double num2 = sc.nextDouble();
		double output = 0;
		boolean flag = true;
		switch(op)
		{
			case '+':output = num1 + num2;break; 
			case '-':output = num1 - num2;break; 
			case '*':output = num1 * num2;break; 
			case '/':output = num1 / num2;break; 
			case '%':output = num1 % num2;break; 
			default :System.out.print("Invalid Input");flag=false; 
		}
		if(flag){
			System.out.print(num1 +" "+op+" "+num2+" = "+output);
		}
	}
}