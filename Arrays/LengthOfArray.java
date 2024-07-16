class LengthOfArray{
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		int len = 0;
		for(int i:arr)
			len++;
		System.out.println("Length of array is: "+len);
		System.out.println("Length of array is: "+arr.length); //built-in method length
	}
}

/*class LengthOfArray{
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		int length=0;
		for (; ; ) {
			try{
				System.out.println(arr[length++]);
			}
			catch(ArrayIndexOutOfBoundsException ae){
				break;
			}
		}
		System.out.println("Length of array is: "+(length-1));
	}
}*/