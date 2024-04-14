//Print the pattern
// * * * * *
//   * * * *
//     * * *
//       * *
//         *

class PatternRev2{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int sp=1;sp<=i-1;sp++){
				System.out.print("  ");
			}
			for(int j=5;j>=i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}