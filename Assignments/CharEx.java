//A->1 AA->27 AB->28

import java.util.Scanner;
class CharEx{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		String str =sc.nextLine().toUpperCase();
		int op =0;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			op = op * 26 + (ch-64); 
		}
		System.out.println(op);
	}
}