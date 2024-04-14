import java.util.Scanner;
class PalindromeName{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name:");
		String name = sc.next();
		String revname = "";
		for(int i = name.length()-1;i>=0;i--){
			revname+=name.charAt(i);
		}
		if(revname.equals(name))
			System.out.print(name+" is a Palindrome");
		else
			System.out.print(name+" is not palindrome");
	}
}