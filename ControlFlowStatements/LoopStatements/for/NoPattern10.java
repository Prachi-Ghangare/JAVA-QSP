//Print the pattern
// 15 14 13 12 11
// 10  9  8  7  
// 6   5  4  
// 3   2   
// 1

class NoPattern10{
	public static void main(String[] args) {
		int num=15;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5-i+1;j++){
				System.out.print(num-- +" ");
			}
			System.out.println();
		}
	}
}