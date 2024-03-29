//Write a program to check whether a character is vowel or not

import java.util.Scanner;

class VowelSwitch{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = sc.next().toLowerCase().charAt(0);
		switch(ch)
		{
			case 'a': //fallthrough
			case 'e': //fallthrough
			case 'i': //fallthrough
			case 'o': //fallthrough
			case 'u':System.out.print(ch+" is a Vowel");break;
			default:System.out.print(ch+" is a Consonent");break;
		}
	}
}