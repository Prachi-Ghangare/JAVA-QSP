import java.util.*;
class ZigzagArray{
	public static void main(String[] args) {
		int [] arr1={1,2};
		int [] arr2={3,4,5};

		//find length of new array using lengths of two arrays
		int mergeSize=arr1.length+arr2.length;
		int [] merge=new int[mergeSize];
		int ind=0;

		//finding max length to iterate the loop bcoz we don't kno which arr is bigger
		int max=(arr1.length>arr2.length)?arr1.length:arr2.length;
		for(int i=0;i<max;i++){
			//check if indx is less than smaller arr length else AIOOBE
			if(i<arr1.length)
				merge[ind++]=arr1[i];
			//storing ele directly from 2nd arr
			merge[ind++]=arr2[i];
		}
		System.out.println(Arrays.toString(merge));
	}
}