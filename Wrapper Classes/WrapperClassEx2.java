class WrapperClassEx2{
	public static void main(String[] args) {
		int a = 127;
		int b=127;
		System.out.println(a==b); //true

		/*int a = 127;
		int b= -127;
		System.out.println(a==b); //true*/

		/*Integer a = 127;
		Integer b = 212;
		System.out.println(a==b); //false*/

		/*Integer a = -128;
		Integer b = -128;
		System.out.println(a==b); //true ,check upto byte range*/

		/*Integer a = 128;
		Integer b = 128;
		System.out.println(a==b); //false*/
	}
}