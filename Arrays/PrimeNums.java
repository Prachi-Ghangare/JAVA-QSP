import java.util.*;
class PrimeNums{
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num to find prime no.s upto that no.: ");
		int num=sc.nextInt();
		int count=0;
		for(int i=0;i<=num;i++){ //i=3 num=10 3<10 4 4<10
			if(i==0 || i==1) 
				continue ;
			boolean flag=true;
			for(int j=2;j<i;j++){ //j=2 2<10 3 3<10 
				if(i==2)
				// System.out.print(i+" ");
					count++; //0(1)
				if(i%j==0){			//3%2=0 3%3=0
					flag=false;
					break;
					// count++; //0(1) 1(2)
				}
			}
			// if(count==2)
			// 	System.out.print(i +" ");
			if(flag)
				// System.out.print(i+" ");
				count++;
		}
		// System.out.println(count);
		int [] prime = new int[count];
		int indx=0;
		for(int i=0;i<=num;i++){ //i=3 num=10 3<10 4 4<10
			if(i==0 || i==1) 
				continue ;
			boolean flag=true;
			for(int j=2;j<i;j++){ //j=2 2<10 3 3<10 
				if(i==2)
					prime[indx++]=i;
				if(i%j==0){			//3%2=0 3%3=0
					flag=false;
					break;
				}
			}
			if(flag)
				prime[indx++]=i;
		}
		System.out.println(Arrays.toString(prime));
	}*/

	static int num=2;
	public static void main(String[] args) {
		int [] arr = new int[10];
		int count=10;
		int indx=0;
		for (; ; ) {
			if(fetchPrimeNumber()){
				arr[indx++]=num;
				count--;
			}
			num++;
			if(count==0)
				break;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static boolean fetchPrimeNumber(){
		boolean flag = true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag=false;
				break;
			}
		}
		return flag;
	}
}