import java.util.*;
class TechM{
	public static void main(String[] args) {
		//Addition of two largest no. from an array
		/*
		int [] arr = {49,3,5,2,19,11,20,27};
		int sum = 0;
		Arrays.sort(arr);
		sum=arr[arr.length-1]+arr[arr.length-2];
		System.out.println(sum);
		*/

		//Addition of no. present at odd position in an array
		/*
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		for(int i=0;i<arr.length;i+=2)
			sum+=arr[i];
		System.out.println(sum);
		*/

		//Addition of prime no. present in given no.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int sum=0;
		while(num>0){
			int rem = num%10;
			if(isPrime(rem)){
				sum+=rem;
			}
			num/=10;
		} 
		System.out.println(sum);
	}
	public static boolean isPrime(int num){
		if(num<2){
			return false;
		}
		boolean flag = true;
		for(int i=2;i<num;i++){
			if (num%i==0){
				flag = false;
				break;
			}
		}
		return flag;
	} 
}