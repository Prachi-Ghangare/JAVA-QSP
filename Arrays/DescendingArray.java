import java.util.*;
class DescendingArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}