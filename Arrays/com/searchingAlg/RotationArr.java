import java.util.*;
class RotationArr{
	public static void main(String[] args) {
		/*int [] arr = {4,2,1,3,5};
		int rotate = 3;
		for(int i=0;i<rotate;i++){
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++){
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
		System.out.println(Arrays.toString(arr));*/

		int [] arr = {4,2,1,3,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rotation: ");
		int rotate=sc.nextInt();
		System.out.println("Enter the direction(C/A): ");
		char ch = sc.next().charAt(0);
		if(ch=='C'){
			for(int i=0;i<rotate;i++){
			int temp=arr[0];
				for(int j=0;j<arr.length-1;j++){
					arr[j]=arr[j+1];
				}
				arr[arr.length-1]=temp;
			}
		}
		else{
			for(int i=0;i<rotate;i++){
			int temp=arr[arr.length-1];
				for(int j=arr.length-2;j>=0;j--){
					arr[j+1]=arr[j];
				}
				arr[0]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}