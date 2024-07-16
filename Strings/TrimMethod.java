import java.util.Scanner;
class TrimMethod{
	static String str;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		System.out.println(str+":"+str.length());
		String str1 = userTrim();
		System.out.println(str1+":"+str1.length());
		// System.out.println(str.length());
		// System.out.println(str1.length());
		// System.out.println(str+" : "+str1);
	}
	public static String userTrim() {
		String nstr="";
		int indx=0;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch!=' '){
				indx=i;
				break;
			}
		}
		String op=str.substring(indx);
		for(int i=str.length()-1;i>=0;i--){
			char ch = str.charAt(i);
			if(ch!=' '){
				indx=i;
				break;
			}
		}
		op=op.substring(0,indx-1);
		// System.out.println(op+" : "+(op.length()));
		return op;
	}
}