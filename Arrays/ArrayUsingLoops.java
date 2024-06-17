import java.util.*;
class ArrayUsingLoops{
	public static void main(String[] args) {
		int [] a = {10,20,30,40,50};
		System.out.print("1.for loop: ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\n2.while loop: ");
		int i=0;
		while(i<a.length){
			System.out.print(a[i]+" ");
			i++;
		}
		System.out.print("\n3.do-while loop: ");
		int j=0;
		do{
			System.out.print(a[j]+" ");
			j++;
		}while(j<a.length);
		System.out.print("\n4.for each: ");
		for (int k :a ) {
			System.out.print(k+" ");
		}
	}
}