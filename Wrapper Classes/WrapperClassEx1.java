//conversion without using value() and valueOf()
class WrapperClassEx1{
	public static void main(String[] args) {
		Integer a = 10;
		System.out.println(a);
		int b = (int)a;
		System.out.println(b);
		Integer c = (Integer)b;
		System.out.println(b);

		/*Byte a = 10;
		System.out.println(a);
		int b = (byte)a;
		System.out.println(b);
		Integer c = (Integer)b;
		System.out.println(b);*/

		/*char a = 's';
		System.out.println(a);
		char b = (char)a;
		System.out.println(b);
		Character c = (Character)b;
		System.out.println(b);*/
	}
}