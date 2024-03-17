// WAP to find whether a character is alphabet or not and check it is an uppercase char or lowercase char.

import java.util.Scanner;

class Alphabet{
	public static void main(String[] args) {
		// (op1 / condition)?op2:op3 ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character:");
		char ch = sc.next().charAt(0);
		// op1 = ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
		// op2 = ((ch >= 65 && ch <= 90)?ch+" is an alphabet and a Uppercase alphabet":ch+" is an alphabet and a lowercase alphabet")
		// op3 = ch+" is not an alphabet"
		System.out.print(((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))?((ch >= 65 && ch <= 90)?ch+" is an alphabet and a Uppercase alphabet":ch+" is an alphabet and a lowercase alphabet"):ch+" is not an alphabet");
	}
}