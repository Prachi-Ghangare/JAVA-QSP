import java.util.Scanner;
class ToLowerCase{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.next();
		String op = userToLowerCase(str);
		System.out.println(str+" : "+op);
	}
	public static String userToLowerCase(String str) {
		String nstr="";
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z'){
				nstr+=(char)(ch+32);
			}
			else{
				nstr+=ch;
			}
		}
		return nstr;
	}
}