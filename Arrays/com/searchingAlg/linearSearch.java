class linearSearch {
	public static void main(String[] args) {
		int [] a = {5,1,3,2,4,6};
		int target = 2;
		int indx=linearSearch(a,target);
		if(indx==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index:"+indx);
	}
	public static int linearSearch(int [] a ,int target) {
		for(int i=0;i<a.length;i++){
			if(a[i]==target)
				return i;
		}
		return -1;
	}
}
