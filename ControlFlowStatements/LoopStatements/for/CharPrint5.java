//Print the pattern 
//	A
//	AB
//	ABC
//	ABCD
//	ABCDE
//	ABCD
//	ABC
//	AB
//	A

class CharPrint5{
	public static void main(String[] args) {
	 for(int i=1;i<=5;i++){
	 	char ch1 = 'A';
	 	for(int j=1;j<=i;j++){
	 		System.out.print(ch1++);
	 	}
	 	for(int s=1;s<=2*(5-i);s++){
	 		System.out.print(" ");
	 	}
	 	System.out.println();
	 }
	 for(int i=1;i<=5;i++){
	 	char ch2 = 'A';
	 	for(int j=4;j>=i;j--){
	 			System.out.print(ch2++);
	 	}
	 	System.out.println();
	 	}
	}
}


