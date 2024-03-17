//Write a program to check whether a user is eligible to vote or not.

import java.util.Scanner;

class Election{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age:");
		int age = sc.nextInt();
		if(age>=18){
			System.out.print("Do you have voter Id (yes/no):");
			String voterId = sc.next().toLowerCase();
			if(voterId.equals("yes")){
				System.out.println("******* WELCOME ********");
				System.out.println("1.BJP");
				System.out.println("2.CONGRESS");
				System.out.println("3.MNS");
				System.out.println("4.NCP");
				System.out.println("5.AAP");
				System.out.println("6.SHIVSENA");
				System.out.println("7.NOTA");
				System.out.print("Enter the option to vote for your fav party:");
				String vote = sc.next().toUpperCase();
				
				if(vote.equals("BJP")){
					System.out.print("You have voted for BJP");
				}
				else if(vote.equals("CONGRESS")){
					System.out.print("You have voted for CONGRESS");
				}
				else if(vote.equals("MNS")){
					System.out.print("You have voted for MNS");
				}
				else if(vote.equals("NCP")){
					System.out.print("You have voted for NCP");
				}
				else if(vote.equals("AAP")){
					System.out.print("You have voted for AAP");
				}
				else if(vote.equals("SHIVSENA")){
					System.out.print("You have voted for SHIVSENA");
				}
				else if(vote.equals("NOTA")){
					System.out.print("Thank you for wasting your vote.");
				}
				else{
					System.out.print("Enter the valid input from above options");
				}
			}
			else{
				System.out.print("jaldi yaha se hato");
			}
		}else{
			System.out.print("You are not eligible to vote .Try after "+(18-age)+"years");
		}
	}
}