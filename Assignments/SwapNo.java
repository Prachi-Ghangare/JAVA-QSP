//Swap the no. from given no. based on key provided
import java.util.Scanner;
class SwapNo{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Enter the interval:");
		int intv = sc.nextInt();
		System.out.println(swap(num,intv));

	}
	public static int swap(int num,int intv) {
		String str = ""+num;
		int len = str.length();
		String str1 = "";
		for(int i=1;i<=intv;i++){
			str+=num;
		}
		for(int i=0;i<len;i++){
			str1+=str.charAt(i+intv);
		}		
		return Integer.parseInt(str1);
	}
}