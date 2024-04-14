//1. Print the pattern
//         *
//       *   *
//     *       *
//   *           *
// * * * * * * * * *

class HollowPyr{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=5;j>i;j--){
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++){
				if(j==1|| i==5){
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for(int j=2;j<=i;j++){
				if(i==j || i==5){
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}	
	}
}

//2. Print the pattern
// * * * * * * * * *
//   *           *
//     *       *
//       *   *
//         *

/*class HollowPyr{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<i;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=5-i+1;j++){
				if(j==1|| i==1){
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for(int j=4;j>=i;j--){
				if(i==j || i==1){
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}	
	}
}*/

//3.Print the pattern
//         *
//       * *
//     *   *
//   *     *
// *       *
//   *     *
//     *   *
//       * *
//         *
	
/*class HollowPyr{
	public static void main(String[] args) {
		for (int i=1;i<=5;i++ ) {
			for(int j=1;j<=5;j++){
				if(j==5||(i+j)==6){
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (int i=1;i<=4;i++ ) {
			for(int j=1;j<=i;j++){
				System.out.print("  ");
			}
			for(int j=4;j>=i;j--){
				if(j==4 || j==i){
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}*/

//4.Print the pattern
// *
// * *
// *   *
// *     *
// *       *
// *     *
// *   *
// * *
// *

/*class HollowPyr{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for (int j=1;j<=i;j++) {
				if(j==1||i==j){
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (int i=4;i>=1;i--) {
			for (int j=1; j<=i;j++ ) {
				if(j==1 || i==j){
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}*/