import java.util.*;

class SenToWordArray{
	public static void main(String[] args) {
		/*
		String sen="hi how are you";
		String [] words = sen.split(" ");
		System.out.println(Arrays.toString(words));
		*/

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String sen=sc.nextLine();
		int count=1;
		int i=0;
		for(;;){
			String word="";
			for(;i<sen.length();i++){
				char ch = sen.charAt(i);
				if(ch==' '){
					i=i+1; //i++
					count++;
					break;
				}
				word+=ch;
			}
			if(i==sen.length())
				break;
		}
		String [] words = stringToStringArray(count,sen);
		System.out.println(Arrays.toString(words));
	}

	public static String[] stringToStringArray(int count,String sen){
		String [] words = new String[count];
		int indx=0;
		int i=0;
		for(;;){
			String word = "";
			for(;i<sen.length();i++){
				char ch = sen.charAt(i);
				if(ch==' '){
					i=i+1;
					break;
				}
				word+=ch;
			}
			words[indx++]=word;
			if(i==sen.length())
				break;
		}
		return words;
	}
}