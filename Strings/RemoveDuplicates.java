import java.util.*;
class RemoveDuplicates{
	public static void main(String[] args) {
		String str = "Kartik";
		char [] arr = str.toCharArray();
		String nstr="";
		for(int j=0;j<arr.length;j++){
			for(int i=0;i<str.length();i++){
				char ch=str.charAt(i);
				if(ch!=arr[j])
					nstr+=arr[j];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(nstr);
	}
}