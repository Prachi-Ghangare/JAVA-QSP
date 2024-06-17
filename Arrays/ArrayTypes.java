import java.util.*;
class ArrayTypes{
	public static void main(String[] args) {
		//1.Matrix Array
		char [][] ch = {{'a','b'},{'c','d','e'},{'f','g'}};
		System.out.println("1.Matrix Array: "+Arrays.deepToString(ch));
		//2.Jagged Array
		byte [][][] b = {{{10,20},{30,40,50}},{{60},{70,80,90,100}}};
		System.out.println("2.Jagged Array: "+Arrays.deepToString(b));
		//3.Jagged Array
		byte [][][] c = {{{2,4},{8,6,10}},{{12},{14,16},{18}}};
		System.out.println("3.Jagged Array: "+Arrays.deepToString(c));
		//1.Matrix Array
		byte [][] d = {{10,20,30},{40,50},{60,70,80}};
		System.out.println("4.Jagged Array: "+Arrays.deepToString(d));
	}
}