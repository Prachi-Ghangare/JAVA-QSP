import java.util.*;
class PrimeFromArr{
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int [] arr = new int[size];
		int count=0;
		System.out.println("Enter the elements of an array:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			boolean flag=true;
			if(arr[i]==1 || arr[i]==0)
					continue ;
			for(int j=2;j<arr[i];j++){
				if(arr[i]%j==0){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.print(arr[i]+" ");
			}
		}
		*/

		int [] arr={1,2,3,4,5,6,7,8,9};
		for(int num:arr){
			if(isPrime(num))
				System.out.print(num+" ");
		}
	}
	public static boolean isPrime(int num) {
	 	if(num<=1)
	 		return false;
	 	int count=0;
	 	for(int i=2;i<num;i++){
	 		if(num%i==0){
	 			count++;
	 			break;
	 		}
	 	}
	 	if(count==0)
	 		return true;
	 	else
	 		return false;
	}
}	