//print the even number from 1 to 100 using recursion

class RecursiveMethodEx2{
	static int num = 1;
	public static void main(String[] args) {
		evenNums();
	}
	public static void evenNums() {
		if(num%2==0)
			System.out.print(num+" ");
			num++;
		if(num>100)
			return;
		evenNums();
	}
}