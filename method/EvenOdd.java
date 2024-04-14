import java.util.Scanner;
class EvenOdd{
	public static void main(String[] args) { //calling method
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		evenOdd(num);
	}

	public static void evenOdd(int num){ //called method
		if(num%2==0)
			System.out.print(num+" is an even number");
		else
			System.out.print(num+" is a odd number");
	}
}