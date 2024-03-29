import java.util.Scanner;
class LenOfNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num=sc.nextInt();
		int len=0;
		for(int i=num;i!=0;i/=10){
			len++;
		}
		System.out.print("The length of number is:"+len);
	}
}