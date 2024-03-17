// WAP to find whether a character is alphabet or not

import java.util.Scanner;

class IsAlphabet{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character:");
		char ch = sc.next().charAt(0);
		System.out.print((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)?ch+" is an alphabet":ch+" is not an alphabet");
	}
}