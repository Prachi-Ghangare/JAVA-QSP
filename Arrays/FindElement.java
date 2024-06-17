import java.util.*;
class FindElement{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6};
		int findElem = 4;
		boolean flag = false;
		for(int i=0;i<arr.length;i++){
			if(findElem == arr[i]){
				System.out.println("Element "+findElem+" found at position "+(i+1));
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("Element not found :(");
	}
}