import java.util.*;
class StringMethodEx2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String str=sc.next();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			int ascii = ch;
			System.out.println(ch+":"+ascii+" ");
		}
	}
}