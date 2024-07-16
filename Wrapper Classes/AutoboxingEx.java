class AutoboxingEx{
	public static void main(String[] args) {
		/*int a=10;
		System.out.println(a);
		Integer b = new Integer(10); //boxing(explicit conversion)
		Integer d = Integer.valueOf(b); //boxing(explicit conversion)
		System.out.println(b);
		System.out.println(d);
		Integer c = a; //autoboxing(implicit conversion)
		System.out.println(c);
		*/

		byte a=20;
		System.out.println(a);
		Byte b = new Byte(a); //boxing(explicit conversion)
		Byte d = new Byte(20); //CTE: no suitable constructor found for Byte(int) ,argument mismatch; possible lossy conversion from int to byte
		System.out.println(b);
		Byte c = a; //autoboxing(implicit conversion)
		System.out.println(c);

		/*char a='a';
		System.out.println(a);
		Character b = new Character(a); //boxing(explicit conversion)
		System.out.println(b);
		Character c = a; //autoboxing(implicit conversion)
		System.out.println(c);*/

		/*boolean a=true;
		System.out.println(a);
		Boolean b = new Boolean(false); //boxing(explicit conversion)
		System.out.println(b);
		Boolean c = a; //autoboxing(implicit conversion)
		System.out.println(c);*/
	}
}