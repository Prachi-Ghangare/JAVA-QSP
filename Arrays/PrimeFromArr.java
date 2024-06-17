import java.util.*;
class PrimeFromArr{
	public static void main(String[] args) {
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
			for(int j=2;j<arr[i];j++){
				if(arr[i]==1)
					continue ;
				else if(arr[i]%j==0){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.print(arr[i]+" ");
			}
		}
	}
}	