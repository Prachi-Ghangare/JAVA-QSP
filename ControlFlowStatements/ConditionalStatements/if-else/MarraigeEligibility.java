//Write a program to check whether a boy is eligible to marry or not.for eligibility boy should be >= 21 age and have 1 crore property or surname should be "AMBANI" 

import java.util.Scanner;

class MarraigeEligibility{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age:");
		int age = sc.nextInt();
		System.out.print("Enter the property:");
		Double property = sc.nextDouble();
		// sc.nextLine(); option 1 if command prompt is not taking input
		// Scanner sc1 = new Scanner(System.in); //option 2 create another obj of scanner
		// String surname = sc1.next().toUpperCase();
		// sc.reset(); //option 3 which restarts scanner

		System.out.print("Enter the Surname:");
		String surname = sc.next().toUpperCase();
		if((age >=21 && property > 10000000) || surname.equals("AMBANI"))
		{
			System.out.println("Your are eligible to marry");
		}
		else{
			System.out.println("Your are not eligible to marry");
		}

	}
}