import java.util.Scanner;

class CalculateTip{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the subtotal:");
		double subTotal = sc.nextDouble();
		System.out.print("Enter the tip rate:");
		double tipRate = sc.nextDouble();
		double tip = (subtotal/100)*tipRate;
		double total = tip + subTotal;
		System.out.println("The tip is "+tip+" and total is "+total);
	}
}