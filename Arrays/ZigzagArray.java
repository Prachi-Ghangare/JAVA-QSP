import java.util.*;
class ZigzagArray{
	public static void main(String[] args) {
		int [] arr1={1,2};
		int [] arr2={3,4,5};
		int mergeSize=arr1.length+arr2.length;
		int [] merge=new int[mergeSize];
		int ind=0;
		int max=(arr1.length>arr2.length)?arr1.length:arr2.length;
		for(int i=0;i<max;i++){
			if(i<arr1.length)
				merge[ind++]=arr1[i];
			merge[ind++]=arr2[i];
		}
		System.out.println(Arrays.toString(merge));
	}
}