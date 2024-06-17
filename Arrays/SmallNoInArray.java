import java.util.*;
class SmallNoInArray{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr [] = new int[6];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}