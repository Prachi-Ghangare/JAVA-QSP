//Write a program to display the month based on user entered month number

import java.util.Scanner;

class Month{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month number:");
		int monthNum = sc.nextInt();
		String month = null;
		switch(monthNum)
		{
			case 1 : month = "January";break;
			case 2 : month = "February";break;
			case 3 : month = "March";break;
			case 4 : month = "April";break;
			case 5 : month = "May";break;
			case 6 : month = "June";break;
			case 7 : month = "July";break;
			case 8 : month = "August";break;
			case 9 : month = "September";break;
			case 10 : month = "October";break;
			case 11 : month = "November";break;
			case 12 : month = "December";break;
			default : System.out.print("Invalid Input");;
		}
		System.out.print((month != null)?(monthNum + "-"+month):"");
	}
}