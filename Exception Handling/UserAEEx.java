import java.util.Scanner;

class UserException extends RuntimeException{
	UserException(String desc){
		super(desc);
	}
}

class UserAEEx{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1=sc.nextInt();
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		if(num2==0){
			try{
				throw new UserException("dividing num by 0");
			}
			catch(UserException u){
				u.printStackTrace();
			}
		}
		else{
			System.out.println(num1/num2);
		}
	}
}