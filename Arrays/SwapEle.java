import java.util.*;
class SwapEle{
	public static void main(String[] args) {
		int [] arr = {2,6,3,5,4};
		int temp=0;
		for(int i=0,j=arr.length-1;i<(arr.length/2);i++,j--){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			// System.out.println(i+":"+Arrays.toString(arr)); 
		}
		System.out.println(Arrays.toString(arr));
	}
}