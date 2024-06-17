import java.util.*;
class StringConst{
	public static void main(String[] args) {
		//1.String() 
		String str = new String();
		System.out.println(str);

		//2.String(String str)
		// String str = new String("Hello world");
		// System.out.println(str);

		/*3.String(StringBuffer sb)
		StringBuffer sb = new StringBuffer("Hello world");
		String str = new String(new StringBuffer("Hello world"));
		System.out.println(sb);
		System.out.println(str);*/

		/*4.String(StringBuilder sb)
		StringBuilder sb = new StringBuilder("Hello world");
		String str = new String(new StringBuilder("Hello world"));
		System.out.println(sb);
		System.out.println(str);*/

		/*5.String(char [] var)
		char [] ch = {'R','A','M','E','S','H'};
		System.out.println(Arrays.toString(ch));

		String str = new String(ch);
		System.out.println(str);
		*/

		/*6.String(byte [] var)
		byte [] b = {65,66,67,68,69,70};
		System.out.println(Arrays.toString(b));

		String str = new String(b);
		String str1 = new String(b,0,3);
		System.out.println(str);
		System.out.println(str1);
		*/

	}
}

