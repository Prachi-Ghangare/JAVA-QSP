//Print the pattern
// * * * * *
// * * * *
// * * *
// * *
// *

class PatternRev3{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print("* ");
			}
			for(int sp=1;sp<=i-1;sp++){
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}