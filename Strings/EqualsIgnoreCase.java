import java.util.Scanner;
class EqualsIgnoreCase{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		str = sc.next();
		System.out.print("Enter a string to check: ");
		String str1 = sc.next();
		boolean op = userEqualsIgnoreCase(str1);
		System.out.println(str+" : "+op);
	}
	public static boolean userEqualsIgnoreCase(String str1) {
		boolean flag=true;+
		for(int i=0;i<str1.length();i++){
			char ch = str1.charAt(i);
			if(ch>='A' && ch<='Z'){
				nstr+=(char)(ch+32);
			}
			else{
				nstr+=ch;
			}
		}
		return flag;
	}
}