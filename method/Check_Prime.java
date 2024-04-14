import java.util.Scanner;

class Check_Prime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		for(int i=2;i<num;i++)
		{
			isPrime(i);
		}
	}

	public static void isPrime(int num)
	{
		boolean flag = true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0){
				flag = false;
				break;
			}
		}
		System.out.println(flag?num+" - Prime":num+" - Not Prime");
	}
}