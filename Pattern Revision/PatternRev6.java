class PatternRev6{
	static int num=2;
	static int count=1;
	public static void main(String[] args) {
		for(int i=1;count<11;i++){
			loop:
			for(int j=1;j<=i;j++){
				if(prime()){
					System.out.print(num +" "); //2 3 
					count++; //1 2
					num++;
				}
				else{
					num++;
					continue loop ;
				}
			}
			System.out.println();
		}
	}
	public static boolean prime() {
		boolean flag = true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag = false;
				break;
			}
		}
		return flag;
	}
}