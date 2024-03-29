//Print the pattern
//	1
//	3 2
//	6 5 4
//	10 9 8 7
//	15 14 13 12 11

class NoPattern4{
	public static void main(String[] args) {
		int num=1; //2
		for(int i=1;i<=5;i++){  
			for(int j=num+i-1;j>=num;j--){  
				System.out.print(j +" "); 
			}
			num+=i; 
			System.out.println();
		}
	}
}







