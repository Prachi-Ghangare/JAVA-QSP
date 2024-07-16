import java.util.*;
class BinarySearch{
	public static void main(String[] args) {
		int [] a = {5,1,3,2,4,6,9,7,8,10};
		Arrays.sort(a);
		int target = 1;
		int indx=binarySearch(a,target);
		if(indx==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index "+indx);
	}
	public static int binarySearch(int [] a ,int target) {
		int min=0;
		int max=a.length - 1;
		while(min<=max){
			int mid = min+(max-min)/2;
			int midEle = a[mid];
			if(midEle>target)
				max=mid-1;
			else if(midEle<target)
				min=mid+1;
			else
				return mid;
		}
		return -1;
	}
}