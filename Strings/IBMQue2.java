import java.util.*;
class IBMQue2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		String str = sc.nextLine();
		String [] str1 = str.split(" ");
		String op ="";
		int max=0;
		for(String i:str1){
			int len=i.length();
			if(max<len && len%2==0){
				// max=i.length();
				max=len;
				op=i;
			}
		}
		// System.out.println(Arrays.toString(str1));
		System.out.println(str+" : "+op);
	}
}