//Write a program to check whether a character is vowel or consonent.

import java.util.Scanner;

class Vowel{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = sc.next();
		char ch = name.charAt(0);
		System.out.println("Hi my name is "+name+" and my first character is "+ch);
		if((ch=='a' || ch =='A') || (ch=='e' || ch=='E') || (ch=='i' || ch=='I') || (ch=='o' || ch=='O') || (ch=='u' || ch=='U') ){
			System.out.println("Character "+ch+" is a vowel");
		}else{
			System.out.println("Character "+ch+" is a consonent");
		}

	}
}