import java.util.*;
class TwoDSumProd{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		/*for same dimensions

		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int [][] arr=new int[size][size];
		int sum=0,prod=1;
		System.out.println("Enter array element: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j]=sc.nextInt();
				sum=sum+arr[i][j];
				prod = prod*arr[i][j];
			}
			System.out.println();
		}
		System.out.println("Sum: "+sum);
		System.out.println("Product: "+prod);
		*/

		//for different dimension array
		System.out.println("Enter the no. of rows of array: ");
		int rows = sc.nextInt();
		System.out.println("Enter the no. of cols of array: ");
		int cols = sc.nextInt();
		int [][] arr=new int[rows][cols];
		int sum=0,prod=1;
		System.out.println("Enter array element: ");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				arr[i][j]=sc.nextInt();
				sum=sum+arr[i][j];
				prod = prod*arr[i][j];
			}
			System.out.println();
		}

		//prining the 2D array
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("Sum: "+sum);
		System.out.println("Product: "+prod);
	}
}