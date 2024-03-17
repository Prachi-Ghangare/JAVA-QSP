import java.util.Scanner;
class BloodDonation{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Enter your weight:");
		double w = sc.nextDouble();
		System.out.print("Have you taken cigarette or alcohol in 24 hours(yes/no)");
		String cigretteAlcohol = sc.next().toLowerCase();
		if((age>20 || cigretteAlcohol.equals("no"))&& (w>50)){
			System.out.print("You can donate the blood");
		}
		else{
			System.out.print("You are not eligible to donate");
		}
	}
}