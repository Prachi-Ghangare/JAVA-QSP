import java.util.*;
class FibArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num to find fibonacci series upto that no.: ");
		int num=sc.nextInt();
		int [] fib = new int[num];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<fib.length;i++){
			// if(i==0)
			// 	fib[0]=0;
			// if(i==1)
			// 	fib[1]=1;
			// fib[i]=fib[0]+fib[1];
			// fib[0]=fib[1];
			// fib[1]=fib[i];
			fib[i]=fib[i-1]+fib[i-2];
		}
		System.out.println(Arrays.toString(fib));
	}
}