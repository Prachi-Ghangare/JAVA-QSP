class MixPattern{
	public static void main(String[] args) {
		int num=5;
		char ch='c',ch1='a';
		for(int i=1;i<=5;i++){ 
			for(int sp=1;sp<i;sp++){ 
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--){ 
				if(i==4)
					System.out.print(ch1++);
				else if(i%2==0)
					System.out.print(ch++);
				else
					System.out.print(num++);  
			}
			// System.out.println(" "+num);
			num=(num%2)+1;
			System.out.println();
		}
	}
}