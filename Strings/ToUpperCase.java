import java.util.Scanner;
class ToUpperCase{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.next();
		String op = userToUpperCase(str);
		System.out.println(str+" : "+op);
	}
	public static String userToUpperCase(String str) {
		String nstr="";
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z'){
				nstr+=(char)(ch-32);
			}
			else{
				nstr+=ch;
			}
		}
		return nstr;
	}
}