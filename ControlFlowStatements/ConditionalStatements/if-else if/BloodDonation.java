//Write a program to check whether user is able to donate blood or not? User must be 20+ and must not consume cigarette or alcohol in 24 hours before donating blood and weight must be more than 50 kg

import java.util.Scanner;
class BloodDonation{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age:");
		int age = sc.nextInt();
		if(age>20){
			System.out.print("Have you consume cigarette or alcohol(yes/no):");
			String cigaretteAlcohol = sc.next().toLowerCase();
			if(cigaretteAlcohol.equals("yes")){
				System.out.print("You cannot donate your blood");
			}
			else{
				System.out.print("Enter your weight:");
				double w = sc.nextDouble();
				if(w>50){
					System.out.print("You can donate your blood");
				}
				else{
					System.out.print("Have some food and gain your weight");
				}
			}
		}
		else{
			System.out.print("You are a kid.Try after "+(20-age)+" years");
		}
	}
}