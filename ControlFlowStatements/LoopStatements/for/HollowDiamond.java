//Print the Hollow Diamond Pattern
//		*
//	   * *
//	  *   *
//	 *     *
//	  *   *
//	   * *
//	    *

class HollowDiamond{
	public static void main(String[] args) {
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4-i;j++){
				System.out.print(" ");
			}
				for(int j=i;j<=5;j++){
					System.out.print("*");
				}
			// for(int j=2;j<=i;j++){
			// 	System.out.print("*");
			// }
		System.out.println();
		}
	}
}