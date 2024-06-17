class isEmptyMethod{
	public static void main(String[] args) {
		String str1 = new String();
		System.out.println(str1.isEmpty());		//true

		String str2 = new String("Hello");
		System.out.println(str2.isEmpty());		//false

		String str3 = new String("");
		System.out.println(str3.isEmpty());		//true

		String str4 = new String(" ");
		System.out.println(str4.isEmpty());		//false

		String str5 = null;
		System.out.println(str5.isEmpty());		//NPE
	}
}