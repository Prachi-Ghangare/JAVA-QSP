class DuplicateEle{
	public static void main(String[] args) {
		int [] arr = {1,3,1,4,2,5,2};
		boolean isPresent=false;
		int count=1;
		int ptr=0;
		for(int i=0;i<arr.length;i++){
			if(ptr==arr[i]){
				isPresent=true;
				continue ;
			}
			for(int j=i+1;j<arr.length;j++){
				// if(isPresent)
				// 	continue;
				if(arr[i]==arr[j]){
					count++;
					ptr=arr[i];
					// System.out.println(arr[j]+" ");
				}
			}
			// if(count>0)
				System.out.println(arr[i]+":"+count);
		}
		// System.out.println(temp+" : "+count);
	}
}