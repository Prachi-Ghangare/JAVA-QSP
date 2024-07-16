import java.util.*;
class ArrayInit{
	public static void main(String[] args) {
		/*1.
		char [][] a ={{'A','B'},{'C','D','E','F'}};
		char [][] a = new char[2][];
		a[0] = new char[2];
		a[1] = new char[4];
		System.out.println(Arrays.deepToString(a));
		a[0][0]='A';
		a[0][1]='B';
		a[1][0]='C';
		a[1][1]='D';
		a[1][2]='E';
		a[1][3]='F';
		System.out.println(Arrays.deepToString(a));*/

		/*2.
		int [][][] a = new int[3][][];
		int [][][] a = {{{10,20,30}},{{40},{50}},{{60,70},{80,90},{100,110}}};
		a[0] = new int[1][3];
		a[1] = new int[2][1];
		a[2] = new int[3][2];
		System.out.println(Arrays.deepToString(a));
		a[0][0][0]=10;
		a[0][0][1]=20;
		a[0][0][2]=30;
		a[1][0][0]=40;
		a[1][1][0]=50;
		a[2][0][0]=60;
		a[2][0][1]=70;
		a[2][1][0]=80;
		a[2][1][1]=90;
		a[2][2][0]=100;
		a[2][2][1]=110;
		System.out.println(Arrays.deepToString(a));*/

		/*3.
		int [][][] a = new int[2][][];
		int [][][] a = {{{10,20},{30}},{{40},{50,60},{70,80,90}}};
		a[0]= new int [2][];
		a[0][0] = new int[2];
		a[0][1] = new int[1];
		a[1] = new int[3][];
		a[1][0] = new int[1];
		a[1][1] = new int[2];
		a[1][2] = new int[3];
		System.out.println(Arrays.deepToString(a));
		a[0][0][0]=10;
		a[0][0][1]=20;
		a[0][1][0]=30;
		a[1][0][0]=40;
		a[1][1][0]=50;
		a[1][1][1]=60;
		a[1][2][0]=70;
		a[1][2][1]=80;
		a[1][2][2]=90;
		System.out.println(Arrays.deepToString(a));*/

		/*4.
		int [][][] a = new int [1][2][2];
		int [][][] a ={{{10,20},{30,40}}};
		a[0][0][0]=10;
		a[0][0][1]=20;
		a[0][1][0]=30;
		a[0][1][1]=40;
		System.out.println(Arrays.deepToString(a));*/

		/*5.
		int [][][] a = new int[2][1][];
		int [][][] a = {{{10,20}},{{30,40,50,60}}};
		a[0][0] = new int[2];
		a[1][0] = new int[4];
		a[0][0][0] = 10;
		a[0][0][1] = 20;
		a[1][0][0] = 30;
		a[1][0][1] = 40;	
		a[1][0][2] = 50;	
		a[1][0][3] = 60;	
		System.out.println(Arrays.deepToString(a));*/

		/*6.
		int [] a = new int[3];
		int [] a ={10,20,30};
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		System.out.println(Arrays.toString(a));*/

		/*7.
		int [][] a = new int[2][2];
		int [][] a = {{10,20},{30,40}};
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		System.out.println(Arrays.deepToString(a));*/

		/*8.
		int [][] a = new int[3][];
		int [][] a ={{10,20},{30,40,50},{60,70}};
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[2];
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		a[1][2] = 50;
		a[2][0] = 60;
		a[2][1] = 70;
		System.out.println(Arrays.deepToString(a));*/

		/*9.
		int [][][] a = new int[3][2][2];
		int [][][] a = {{{10,20},{30,40}},{{50,60},{70,80}},{{90,100},{110,120}}};
		a[0][0][0] = 10;
		a[0][0][1] = 20;
		a[0][1][0] = 30;
		a[0][1][1] = 40;
		a[1][0][0] = 50;
		a[1][0][1] = 60;
		a[1][1][0] = 70;
		a[1][1][1] = 80;
		a[2][0][0] = 90;
		a[2][0][1] = 100;
		a[2][1][0] = 110;
		a[2][1][1] = 120;
		System.out.println(Arrays.deepToString(a));*/

		/*10.
		int [][][] a = new int[2][][];
		int [][][] a = {{{10,20,30}},{{40,50},{60}}};
		a[0]=new int[1][3];
		a[1]=new int[2][];
		a[1][0] = new int[2];
		a[1][1] = new int[1];
		a[0][0][0] = 10;
		a[0][0][1] = 20;
		a[0][0][2] = 30;
		a[1][0][0] = 40;
		a[1][0][1] = 50;
		a[1][1][0] = 60;
		System.out.println(Arrays.deepToString(a));*/
	}
}