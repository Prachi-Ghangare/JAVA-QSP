import java.util.Scanner;
class PwdCheck{
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		int attempt=1;
		outerloop:
		for(;;){
			int storedPin = 1234;
			int count=3;
			do{
				System.out.print("Enter your pin: ");
				int upin = sc.nextInt();
				if(storedPin==upin){
					System.out.println("Correct Password");
					break outerloop;
				}
				else{
					System.out.println("Wrong Pin Attempt left "+(count-1));
					if(count==1 && attempt==1){
					System.out.println("You can try again");
					System.out.println();
					Thread.sleep(5000);
				}
				}
				count--;
			}while(count>=1);
			if(attempt++ ==2){
				System.out.println("Please Try again after some time ");
				break;
			}
		}
	}
}