//Write a program that increases the pay of an employee by 3%, if his monthly target score is greater than 90,otherwise increases pay by 1%

import java.util.Scanner;

class EmployeePay{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the employee pay:");
		double pay = sc.nextDouble();
		System.out.print("Enter the monthly target score:");
		int target = sc.nextInt();
		if(target>90){
			pay += (pay)*3/100;
			System.out.print(pay);
		}
		else{
			pay += (pay)*1/100;
			System.out.print(pay);
		}
	}
}