import java.util.*;
class Merging2DArr{
	public static void main(String[] args) {
		int [][] a = {{1,2,3},{4,5,6}};
		int [][] b = {{7,8,9},{10,11,12,13,14,15}};

		int len=0;
		for (int[] i : a ) 
			len+=i.length;

		for (int[] i : b ) 
			len+=i.length;

		int [] c = new int[len];

		int indx=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				c[indx++]=a[i][j];
			}
		}

		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				c[indx++]=b[i][j];
			}
		}


		// for(int i:a)
		// 	c[indx++]=i;

		// for(int i:b)
		// 	c[indx++]=i;

		System.out.println(Arrays.toString(c));
	}
}