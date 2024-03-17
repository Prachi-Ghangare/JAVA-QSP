//Write a program to check if the person is eligible for driving license? Person must completed 18+ and should have passed the RTO test with more than 60 marks if not re-appeadred for the test again.

import java.util.Scanner;

class DrivLicElig{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age:");
		int age = sc.nextInt();
		if(age>18){
			System.out.print("Have you passed in RTO test(yes/no):");
			String passed = sc.next().toLowerCase();
			if(passed.equals("yes")){
					System.out.print("Enter your RTO Test marks:");
					double rtoResult = sc.nextDouble();
					if(rtoResult>60){
						System.out.print("You are eligible for driving license");
					}else{
						System.out.print("You are eligible for driving license.Please re-appeared for exam");
					}
				}
				else{
					System.out.print("You are eligible for driving license.Please re-appeared for exam");
				}
		}
		else{
			System.out.print("You are not eligible for driving license.Try after"+(18-age)+" years");
		}
	}
}