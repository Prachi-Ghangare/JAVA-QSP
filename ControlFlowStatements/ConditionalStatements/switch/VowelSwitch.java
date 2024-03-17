import java.util.Scanner;

class VowelSwitch{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = sc.next().toLowerCase().charAt(0);
		switch(ch)
		{
			case 'a': //fallthorugh
			case 'e': //fallthorugh
			case 'i': //fallthorugh
			case 'o': //fallthorugh
			case 'u':System.out.print(ch+" is a Vowel");break;
			default:System.out.print(ch+" is a Consonent");break;
		}
	}
}