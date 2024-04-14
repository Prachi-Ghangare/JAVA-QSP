class NoPattern12{
	 public static void main(String[] args) {
	 	int num1=1,num2=2;
	 	for(int i=1;i<=5;i++){
	 		for(int j=i;j>=1;j--){
	 			if(i%2==0){
	 				System.out.print(num2+" ");
	 				num2+=2;
	 			}
	 			else{
	 				System.out.print(num1+" ");
	 				num1+=2;
	 			}
	 		}
	 		System.out.println();
	 	}
	}
}