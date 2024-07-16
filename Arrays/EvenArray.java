//Fetch even no. from array and store in another arr

import java.util.*;
class EvenArray{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8};

		//find count of odd elements
		int count=0;
		for(int i:arr)
		{
			if(i%2==0)
				count++;
		}

		int [] evennums = new int [count];

		//index var to store element in oddnums arr
		int indx=0;
		for(int i:arr){
			//check if element is odd & store it by incr by 1
			if(i%2==0)
				evennums[indx++]=i;
		}

		System.out.println(Arrays.toString(evennums));
	}
}