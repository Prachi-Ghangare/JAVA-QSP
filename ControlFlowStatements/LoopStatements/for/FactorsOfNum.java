import java.util.Scanner;
class FactorsOfNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		for(int i=num;i>=1;i--){
			if(num%i==0){
				System.out.println("The factor of a "+num+" is "+i);
			}
		}
	}
}