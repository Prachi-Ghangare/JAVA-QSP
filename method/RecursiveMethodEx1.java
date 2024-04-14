//print the number from 1 to 10 using recursion

class RecursiveMethodEx1{
	static int num = 1;
	public static void main(String[] args) {
		printNum();
	}
	public static void printNum() {
		System.out.println(num);
		num++;
		if(num>10) //base condition
			return;
		printNum();
	}
}