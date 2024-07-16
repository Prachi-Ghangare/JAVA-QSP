import java.util.*;
class AmdoxQue{
	static String str;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.next();
		int len = str.length();
		String fh="";
		String sh="";
		for(int i=0;i<(str.length()/2);i++){
			char ch=str.charAt(i);
			fh+=ch;
			fh=reverseStr(fh);
		}
		for(int i=str.length()/2;i<str.length();i++){
			char ch=str.charAt(i);
			sh+=ch;
			sh=reverseStr(sh);
		}
		System.out.println(fh+" , "+sh);

		/*String fh =((new StringBuffer(str.substring(0,len/2))).reverse()).toString();
		String sh =((new StringBuffer(str.substring(len/2,len))).reverse()).toString();
		System.out.println(fh+" , "+sh);

		String op = "";
		for(int i=0;i<sh.length();i++){
			if(i<fh.length())
				op+=fh.charAt(i);
			op+=sh.charAt(i);
		}
		System.out.println(op);*/
	}
	public static String reverseStr(String str){
		String rev="";
		for(int i=str.length()-1;i>=0;i++){
			char ch = str.charAt(i);
			rev=rev+ch;
		}
		return rev;
	}
}