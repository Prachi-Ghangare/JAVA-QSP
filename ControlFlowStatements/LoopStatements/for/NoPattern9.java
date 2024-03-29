//Print the pattern 
//	1        1
//	12      21
//	123    321 
//	1234  4321
//	1234554321
//	1234554321
//	1234  4321
//	123    321
//	12      21
//	1        1

class NoPattern9{
	public static void main(String[] args) {
	int i;
	 for(i= 1;i<=5;i++){
	 	for(int j=1;j<=i;j++){
	 		System.out.print(j);
	 	}

	 	for(int s=1;s<=2*(5-i);s++){
	 		System.out.print(" ");
	 	}
	 	for(int j=i;j>=1;j--){
	 			System.out.print(j);
	 	}
	 	System.out.println();
	 	}

	 for(i=5;i>=1;i--){
	 	for(int j=1;j<=i;j++){
	 		System.out.print(j);
	 	}

	 	for(int s=1;s<=2*(5-i);s++){
	 		System.out.print(" ");
	 	}
	 	for(int j=i;j>=1;j--){
	 			System.out.print(j);
	 		
	 	}
	 	System.out.println();
	 	}
	 
	}
}