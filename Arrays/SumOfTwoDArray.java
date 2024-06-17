import java.util.*;
class SumOfTwoDArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter cols: ");
		int cols=sc.nextInt();
		int [][] arr=new int[rows][cols];
		int sum=0;

		//inserting element in an array
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				arr[i][j]=sc.nextInt();
				sum+=arr[i][j];
			}
		}
		System.out.println("Sum: "+sum);
	}
}