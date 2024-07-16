import java.util.*;
class ArrayEx1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of chapters:");
		int numChapters=sc.nextInt();
		System.out.println("Enter value of start day: ");
		int b=sc.nextInt();
		System.out.println("Enter value of start day: ");
		int e=sc.nextInt();
		int uchapters = solve(numChapters,b,e);
	}
	/*public static int solve(numChapters,b,e) {
		if((e-b)>=numChapters)
			return numChapters;
		else
			return (e-b)+1;
	}*/

	public static int solve(numChapters,b,e) {
		int [] chapters = new int[(e-b)];
		int indx=0;
		for(int i=0;i<((e-b)/chapters);i++){
			
		}
	}
}