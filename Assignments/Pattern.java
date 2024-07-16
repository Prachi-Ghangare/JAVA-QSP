class Pattern{
	public static void main(String[] args) {
		int num=8;
		/*for(int i=1;i<=4;i++){
			for(int j=4-i+1;j>=1;j--){
				System.out.print("*");
			}
			System.out.println();
		}*/
		for(int i=4;i>0;i--){
			int num2 = num;
			for(int j=num;j>0;j--){
				if(num==0)
					num=num2;
				System.out.print("*"+num);
				num-=2;
			}
			System.out.println();
			num=i*2-2;
		}
	}
}