//Emirp no - check num is prime if it is prime find reverse of no and check if rev & no both are prime or not .If both prime then it is emirp no otherwise not
import java.util.Scanner;
class EmirpNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		checkEmirp(num);
	}

	public static boolean isPrime(int num) {
		if(num<=1)
			return false;
		boolean flag = true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static int reverseNum(int num) {
		int rev=0;
		while(num>0){
			rev =rev*10+num%10;
			num/=10;
		}
		return rev;
	}

	public static void checkEmirp(int num) {
		if(isPrime(num)){
			int rev = reverseNum(num);
			System.out.print(isPrime(rev)?num+" is an Emirp Number":num+" is not an Emirp Number");
		}else System.out.print("Not an Emirp Number");	
	}
}
