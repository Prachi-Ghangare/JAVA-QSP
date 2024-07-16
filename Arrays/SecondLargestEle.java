import java.util.*;
class SecondLargestEle{
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int [] arr= new int[size];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int temp =0;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second Largest Element from an array: "+arr[arr.length-2]);*/

		// int [] arr = {4,2,6,8,1,3,5,7};
		int [] arr = {1,2,3,4,5,6,7};
		int max=0;
		int smax=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			else if(arr[i]>smax && arr[i]<max){
				smax=arr[i];
			}
		}
		System.out.println("Largest element in an array is: "+max);
		System.out.println("Second Largest element in an array is: "+smax);
	}
}