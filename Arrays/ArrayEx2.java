class ArrayEx2{
	public static void main(String[] args) {
		// int n=3;
		int [] arr = {25,10,20};
		int sum=0;
		for(int i=arr.length-2;i>=0;i--){
			int add = arr[i]+arr[i+1];
			sum+=add;
			arr[i]=add;
		}
		System.out.println(sum);
	}
}