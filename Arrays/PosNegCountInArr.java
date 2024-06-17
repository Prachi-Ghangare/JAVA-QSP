import java.util.*;
class PosNegCountInArr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter cols: ");
		int cols=sc.nextInt();
		int [][] arr=new int[rows][cols];
		int countP=0,countN=0;

		//inserting element in an array
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				arr[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(arr[i][j]%2==0)
					countP++;
				else
					countN++;
			}
		}

		System.out.println("Count of positive no. in an array:"+countP);
		System.out.println("Count of negative no. in an array:"+countN);
	}
}