import java.util.*;
class DuplicateChar{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String str = sc.next().toLowerCase();
		System.out.println("Enter character to get count of it: ");
		char ch=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++){
			char ch1=str.charAt(i);
			if(ch1==ch){
				count++;
			}
		}
		System.out.println("Count of "+ch+": "+count);
	}
}