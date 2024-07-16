import java.util.*;
class PrintFactors{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size=sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to get factors of it: ");
		int ele = sc.nextInt();
		int count=0;
		for(int i=ele;i>=1;i--){
			if(ele%i==0){
				count++;
			}
		}
		int [] fact = new int[count];
		int indx=0;
		for(int i=ele;i>=1;i--){
			if(ele%i==0){
				fact[indx++]=i;
			}
		}
		System.out.println(Arrays.toString(fact));
	}
}