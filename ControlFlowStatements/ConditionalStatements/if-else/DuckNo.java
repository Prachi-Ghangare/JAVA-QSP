import java.util.Scanner;

class DuckNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		String num = sc.next();
		if(num.charAt(0)=='0')
			System.out.print(num+" is not a Duck Number");
		else
			System.out.print(num+" is a Duck Number");
	}
}