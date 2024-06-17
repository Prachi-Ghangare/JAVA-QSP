import java.util.*;
class TwoDimArray{
	public static void main(String[] args) {
		int [][] arr = {{10,20,30},{40,50},{60,70,80,90}};
		System.out.print("1.for loop: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.print("\n2.while loop: ");
		int i=0;
		while(i<arr.length){
			int j=0;
			while(j<arr[i].length){
				System.out.print(arr[i][j]+" ");
				j++;
			}
			i++;
		}
		System.out.print("\n3.do-while loop: ");
		int j=0;
		do{
			int k=0;
			do{
				System.out.print(arr[j][k]+" ");
				k++;
			}while(k<arr[j].length);
			j++;
		}while(j<arr.length);
		System.out.print("\n4.for each: ");
		for (int [] k :arr ) {
			for (int l :k ) {
				System.out.print(l+" ");
			}
		}
	}
}