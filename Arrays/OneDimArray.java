import java.util.*;
class OneDimArray{
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50,60,70,80,90};
		System.out.print("1.for loop: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print(Arrays.toString(arr));
		System.out.println();
		System.out.print("\n2.while loop: ");
		int i=0;
		while(i<arr.length){
			System.out.print(arr[i]+" ");
			i++;
		}
		System.out.print(Arrays.toString(arr));
		System.out.println();
		System.out.print("\n3.do-while loop: ");
		int j=0;
		do{
			System.out.print(arr[j]+" ");
			j++;
		}while(j<arr.length);
		System.out.print(Arrays.toString(arr));
		System.out.println();
		System.out.print("\n4.for each: ");
		for (int k :arr ) {
			System.out.print(k+" ");
		}
		System.out.print(Arrays.toString(arr));
		System.out.println();
	}
}