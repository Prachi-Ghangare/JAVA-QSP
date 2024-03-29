//Write a program to display Odd numbers between 1 to 100

class OddNo{
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			if(i%2==1)
				System.out.print(i+" ");

			// if(i%2!=0)
			// 	System.out.print(i+" ");
		}

		// for(int i=1;i<=100;i+=2)
		// 	System.out.print(i+" ");
	}
}