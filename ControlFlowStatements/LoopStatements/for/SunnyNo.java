import java.util.Scanner;
class SunnyNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num=sc.nextInt();
		int nnum= ++num;
		boolean flag=false;
		for(int i=1;i<=nnum/2;i++){
			if(i*i==nnum){
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.print(num+" is a sunny Number");
		else
			System.out.print(num+" is a not sunny Number");
	}
}