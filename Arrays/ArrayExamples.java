import java.util.*;
class ArrayExamples{
	public static void main(String[] args) {
		// int [] arr;
		// int arr [] ;
		// int [] arr,arr1;
		// int [][] arr;
		// int [] arr [],arr1;
		// int [] arr [][], arr1 [], arr2;
		// int [] arr [][],[] arr1;  //CTE:not a statement

		byte arr [] =new byte[4];
		// int [] arr = new int[];  //CTE:array dimension missing
		// short [][] arr = new short[4][];
		// boolean [][] arr = new boolean[4][3];
		// short [] arr = new short[0];
		// arr[0]=10; //RTE:ArrayIndexOutOfBoundsException
		// long [] arr = new long[-1];  //RTE:NegativeArraySizeException
		// int [] arr = new int[2147483647]; //RTE:OutOfMemoryError
		// System.out.println(args.length); //0
		System.out.println(Arrays.toString(arr));
	}
}