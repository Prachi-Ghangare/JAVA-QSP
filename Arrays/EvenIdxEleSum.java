import java.util.*;
class EvenIdxEleSum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter elements of an array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i+=2){
			sum+=arr[i];
		}
		System.out.println("Sum of elements at even indices is: "+sum);
	}
}