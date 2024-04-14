import java.util.Scanner;
class FactorsOfNum{
	static int num;
	static int i=1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		num=sc.nextInt();
		factors();
	}

	public static void factors() {
		if(i>num)
			return;

		if(num%i==0)
			System.out.println("The factor of a "+num+" is "+i);
		
		i++;
		factors();
	}
}