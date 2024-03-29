//Print the pattern
//	1
//	2 2
//	3 3 3
//	4 4 4 4
//	5 5 5 5 5

class NoPattern7{
	public static void main(String[] args) {
		int i=1;
		for(;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}