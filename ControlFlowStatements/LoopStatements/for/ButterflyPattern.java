//Print the butterfly pattern
//	*        *
//	**      **
//	***    ***
//	****  ****
//	**********
//	**********
//	****  ****
//	***    ***
//	**      **
//	*        *

class ButterflyPattern{
	public static void main(String[] args) {
	int i;
	 for(i= 1;i<=5;i++){
	 	for(int j=1;j<=i;j++){
	 		System.out.print("*");
	 	}

	 	for(int s=1;s<=2*(5-i);s++){
	 		System.out.print(" ");
	 	}

	 		for(int j=1;j<=i;j++){
	 			System.out.print("*");
	 	}
	 	System.out.println();
	 	}
	 for(i=5;i>=1;i--){
	 	for(int j=1;j<=i;j++){
	 		System.out.print("*");
	 	}

	 	for(int s=1;s<=2*(5-i);s++){
	 		System.out.print(" ");
	 	}

	 		for(int j=1;j<=i;j++){
	 			System.out.print("*");
	 	}
	 	System.out.println();
	 	}
	 
	}
}