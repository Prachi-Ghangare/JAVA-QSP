//Buzz No - if user entered no is divisible by 7 or numbers last digit is 7 the it is buzz number

import java.util.*;
class BuzzNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		if(num%7==0 || num%10==7)
			System.out.print(num+" is a Buzz Number");
		else
			System.out.print(num+" is not a Buzz Number");
	}
}