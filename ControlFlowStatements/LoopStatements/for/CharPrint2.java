//Print the below pattern
// 		a
// 		b c
// 		d e f
// 		g h i j
// 		k l m n o

class CharPrint2{
	public static void main(String[] args) {
		char ch='a';
		for(int i=1;i<=5;i++){ 
			for(int j=1;j<=i;j++){ 
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
}


