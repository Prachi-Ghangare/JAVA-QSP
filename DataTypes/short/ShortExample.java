class ShortExample {
	public static void main(String[] args) {
		// short a = 32768; //CTE:possible lossy conversion from int to short i.e Exceeds range
		// short a = 32767;
		// a = a+1; //CTE:possible lossy conversion from int to short
		// a += 1; //can add gives -32768 i.e starts from -ve end
		// System.out.println(a);
		// short b = -32768;
		// b = b+1;//CTE:possible lossy conversion from int to short
		 // b += 1; //can add gives -32767
		// System.out.println(b);
		// short max = 32767;
		// short min = -32768;
		System.out.println(max);
		System.out.println(min);
	}
}