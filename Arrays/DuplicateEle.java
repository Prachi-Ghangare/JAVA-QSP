class DuplicateEle{
	public static void main(String[] args) {
		int [] arr = {1,2,3,2,5};
		int count=0;
		int temp;
		for(int i=0;i<arr.length-1;i++){
			temp=arr[i];
			if(arr[i]==temp){
				count++;
			}
		}
		System.out.println(count);
	}
}