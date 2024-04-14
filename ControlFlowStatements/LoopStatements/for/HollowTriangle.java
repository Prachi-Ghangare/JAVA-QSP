//1.Print the below triangle
// *
// * *
// *   *
// *     *
// * * * * *

/*class HollowTriangle{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for (int j=1;j<=i;j++) {
				if(i==5||j==1||i==j){
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}*/

//2.Print the below pattern
// * * * * *
// *     *
// *   *
// * *
// *
/*class HollowTriangle{
	public static void main(String[] args) {
		for (int i=5;i>=1;i--) {
			for (int j=1; j<=i;j++ ) {
				if(i==5 || j==1 || i==j){
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}*/
/*class HollowTriangle{
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for (int j=1; j<=5;j++) {
				if(i==1 || j==1 || (i+j)==6){
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
// * * * * *

/*class HollowTriangle{
	public static void main(String[] args) {
		for (int i=1;i<=5;i++ ) {
			for(int j=1;j<=5;j++){
				if(i==5||j==5||(i+j)==6){
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}*/

//4.Print the below pattern
// * * * * *
//   *     *
//     *   *
//       * *
//         *
        
/*class HollowTriangle{
	public static void main(String[] args) {
		for (int i=1;i<=5;i++ ) {
			for(int j=1;j<=5;j++){
				if(i==1||j==5|| i==j){
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}*/

