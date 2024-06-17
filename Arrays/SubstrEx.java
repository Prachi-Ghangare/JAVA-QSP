import java.util.*;
class SubstrEx{
	public static void main(String[] args) {
		//find distinct char from a string
		String str = "abadcefab";
		System.out.println(str);
		int [] arr = new int[str.length()];
		for(int i=0;i<str.length();i++){
			arr[i]=str.charAt(i);
		} 
		// java 1.8 lambda function
		Arrays.stream(arr).distinct().forEach(ele->System.out.print((char)ele));
	}
}