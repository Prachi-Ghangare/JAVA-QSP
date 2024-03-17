//Write a program to check whether user entered character is vowel or consonent 

import java.util.Scanner;

class VowelCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character:");
		char ch = sc.next().charAt(0);
		if(ch == 'a' || ch == 'A')
			System.out.print(ch+" is a vowel");
		else if(ch == 'e' || ch == 'E')
			System.out.print(ch+" is a vowel");
		else if(ch == 'i' || ch == 'I')
			System.out.print(ch+" is a vowel");
		else if(ch == 'o' || ch == 'O')
			System.out.print(ch+" is a vowel");
		else if(ch == 'u' || ch == 'U')
			System.out.print(ch+" is a vowel");
		else
			System.out.print(ch+" is a consonent");
	}
}