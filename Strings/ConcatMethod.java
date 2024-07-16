import java.util.*;
class ConcatMethod{
	static String str;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		System.out.println("Enter the String to merge: ");
		String str1=sc.nextLine();
		String op = userConcat(str1);
		System.out.println(op);
	}
	public static String userConcat(String str1) {
		return str+" "+str1;
	}
}