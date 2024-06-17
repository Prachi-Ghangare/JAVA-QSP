import java.util.*;
class PalindromeArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		System.out.println("Enter array elements: ");
		char [] arr = new char[size];
		for (int i=0;i<size;i++){
			arr[i]=sc.next().charAt(0);
		}
		char revArr [] = new char[size];
		int indx=0;
		for(int i=arr.length-1;i>=0;i--){
			revArr[indx++]=arr[i];
		}
		if(Arrays.equals(arr,revArr)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}