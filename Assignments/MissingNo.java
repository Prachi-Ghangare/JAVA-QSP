//Find the missing no. from user provided no.
import java.util.Scanner;
class MissingNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		String str = ""+num;
		for(char i=str.charAt(0);i<str.charAt(str.length()-1);i++){
			if(!(str.contains(""+i))){
				System.out.println("Missing No. is:"+i);
			}
		}
	}
}