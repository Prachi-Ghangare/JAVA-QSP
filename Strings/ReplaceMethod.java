import java.util.*;
class ReplaceMethod{
	public static void main(String[] args) {
		/*String str = "Qspiders";
		String newStr1=str.replace('Q','J');
		System.out.println(newStr1);
		String newStr2=str.replace('Q','q');
		System.out.println(newStr2);
		String newStr3=str.replace('Q','j');
		System.out.println(newStr3);*/

		String str1="playhomesss";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char to remove: ");
		String ch1 = sc.next();
		String str2=str1.replace(ch1,"");
		System.out.println(str2);
	}
}