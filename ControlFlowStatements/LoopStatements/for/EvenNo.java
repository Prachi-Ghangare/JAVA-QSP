//Write a program to display even numbers between 1 to 100

class EvenNo{
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			if(i%2==0)
				System.out.print(i+" ");

			// if(i%2!=1)
			// 	System.out.print(i+" ");
		}
	}
}