//Print the pattern
//	1
//	0 1
//	1 0 1
//	0 1 0 1
//	1 0 1 0 1

class NoPattern6{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				if((i+j)%2==1){
					System.out.print("0 ");
				}else{
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}
}