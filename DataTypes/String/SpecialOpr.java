class SpecialOpr{
	public static void main(String[] args) {
		System.out.println("two"+1); //two1
		System.out.println(1+1+"2"); //22
		System.out.println(1+"2"+3); //123
		System.out.println(1+1+"3"+3*4); //2312
		System.out.println(2+2+"3"+(3+2)); //435
		System.out.print(2-1+"2"+4-1); //bad operand types for binary operator '-'
	}
}