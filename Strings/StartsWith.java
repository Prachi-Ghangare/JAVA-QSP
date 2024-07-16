  import java.util.Scanner;
class StartsWith{ 
	static String str;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		System.out.println("Enter string to check: ");
		String str1=sc.next();
		// boolean op = userStartsWith(str1);
		// System.out.println(str+" : "+op);

		System.out.println("Enter indx: ");
		int searchIndx=sc.nextInt();
		boolean op = userStartsWith(str1,searchIndx);
		System.out.println(str+" : "+op);
	}
	/*public static boolean userStartsWith(String str1) {
		boolean flag=true;
		for(int i=0;i<str1.length();i++){
			char ch=str1.charAt(i);
			if(ch!=str.charAt(i)){
				flag=false;
				break;
			}
		}
		return flag;
	}*/

	public static boolean userStartsWith(String str1,int startIndx) {
		if(startIndx<0 || startIndx>str.length()-1){
			throw new StringIndexOutOfBoundsException("Wrong Index: "+startIndx);
		}
		boolean flag=true;
		for(int i=startIndx;i<str1.length();i++){
			char ch=str1.charAt(i);
			if(ch!=str.charAt(i)){
				flag=false;
				break;
			}
		}
		return flag;
	}
}