import java.util.*;
class ThreeDimArray{
	public static void main(String[] args) {
		int [][][] arr = {{{10,20},{30}},{{40,50,60}}};
		System.out.print("1.for loop: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				for(int k=0;k<arr[i][j].length;k++){
					System.out.print(arr[i][j][k]+" ");
				}
			}
		}
		System.out.print(Arrays.deepToString(arr));
		System.out.println();
		System.out.print("\n2.while loop: ");
		int i=0;
		while(i<arr.length){
			int j=0;
			while(j<arr[i].length){
				int k=0;
				while(k<arr[i][j].length){
					System.out.print(arr[i][j][k]+" ");
					k++;
				}
				j++;
			}
			i++;
		}
		System.out.print(Arrays.deepToString(arr));
		System.out.println();
		System.out.print("\n3.do-while loop: ");
		int j=0;
		do{
			int k=0;
			do{
				int l=0;
				do{
					System.out.print(arr[j][k][l]+" ");
					l++;
				}while(l<arr[j][k].length);
				k++;
			}while(k<arr[j].length);
			j++;
		}while(j<arr.length);
		System.out.print(Arrays.deepToString(arr));
		System.out.println();
		System.out.print("\n4.for each: ");
		for (int [][] k :arr ) {
			for (int[] l :k ) {
				for(int m: l){
					System.out.print(m+" ");
				}
			}
		}
		System.out.print(Arrays.deepToString(arr));
	}
}