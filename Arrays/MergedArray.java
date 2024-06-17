import java.util.*;
class MergedArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of 1st array: ");
		int size1=sc.nextInt();
		System.out.println("Enter size of 2nd array: ");
		int size2=sc.nextInt();
		int arr1 [] = new int[size1];
		int arr2 [] = new int[size2];
		System.out.println("Enter element for 1st array: ");
		for(int i=0;i<size1;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter element for 2nd array: ");
		for(int i=0;i<size2;i++){
			arr2[i]=sc.nextInt();
		}
		int mergedsize=size1+size2;
		int mergedArray [] = new int[mergedsize];
		for(int i=0;i<size1;i++){
			mergedArray[i]=arr1[i];
		}
		for(int i=0;i<size2;i++){
			mergedArray[size1+i]=arr2[i];
		}
		System.out.println("1st Array:"+Arrays.toString(arr1));
		System.out.println("2nd Array:"+Arrays.toString(arr2));
		System.out.println("Merged Array:"+Arrays.toString(mergedArray));
	}
}