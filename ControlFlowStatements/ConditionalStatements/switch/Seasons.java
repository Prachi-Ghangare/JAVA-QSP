import java.util.Scanner;

class Seasons{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a month:");
		String month = sc.next().toUpperCase();
		switch(month)
		{
			case "OCTOBER":
			case "NOVEMBER":
			case "DECEMBER":
			case "JANUARY":System.out.print(month+" it's a Winter");break;
			case "FEBRUARY":
			case "MARCH":
			case "APRIL":
			case "MAY":System.out.print(month+" it's a Summer");break;
			case "JUNE":
			case "JULY":
			case "AUGUST":
			case "SEPTEMBER":System.out.print(month+" it's a Rainy");break;
			default:System.out.print("Invalid Input");
		}
	}
}