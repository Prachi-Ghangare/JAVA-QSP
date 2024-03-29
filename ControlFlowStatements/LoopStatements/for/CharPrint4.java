//Print the pattern
//	a
//	a b
//	a b c
//	a b c d
//	a b c d e

class CharPrint4{
	public static void main(String[] args) {
		for(int i = 1;i<=5;i++){
			char ch = 'a';
			for(int j=1;j<=i;j++){
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}

		/*
		for(char i ='a';i<='e';i++){
			for(char j='a';j<=i;j++){
				System.out.print(j +" ");
			}
			System.out.println();
		}
		*/
	}
}