//Write a program to check if the user entered number is even or odd

import java.util.Scanner;
class EvenOdd{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt()
		if(num%2==0){
			System.out.print(num+" is a Even number");
		}else{
			System.out.print(num+" is a Odd number");
		}
	}
}