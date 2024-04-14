import java.util.*;
class FascinatingNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num1=sc.nextInt();
		int num2=num1*2;
		int num3=num1*3;
		String str=""+num1+num2+num3;
		boolean flag = true;

		for(char c='1';c<='9';c++){
			int count=0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==c){
					count++;
				}
			}
			if(count>0){
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.print(num1+" is a fascinating Number");
		else
			System.out.print(num1+" is a not fascinating Number");
	}
}