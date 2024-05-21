class OperatorOverloadEx{
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String str = "Ramesh";

		System.out.println(a+b); //30
		System.out.println(a+str); //10Ramesh
		System.out.println(str+b); //Ramesh20
		System.out.println(str+str); //RameshRamesh
		System.out.println(a+b+str); //30Ramesh
		System.out.println(a+str+b); //10Ramesh20
		System.out.println(str+a+b); //Ramesh1020
	}
}