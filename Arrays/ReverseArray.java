import java.util.*;
class ReverseArray{
	public static void main(String[] args) {
		/*int [] arr = {1,2,3,4,5,6};
		String [] str = {"abc","lmn","xyz"};
		System.out.println("Reversing int Array Element: ");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nReversing String Array element: ");
		for(int i=str.length-1;i>=0;i--){
			System.out.print(str[i]+" ");
		}*/

		int [] arr = {3,5,7,2,8,9};
		int [] rev = new int[arr.length];
		int indx=0;
		for (int i=arr.length-1;i>=0;i--) {
			rev[indx++]=arr[i];
		}
		System.out.println(Arrays.toString(rev));
	}
}