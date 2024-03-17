class PreEx{
	public static void main(String[] args) {
		int a = 2;
		int b = a++; //2(3)
		int c = ++a; //4(4)
		System.out.print(a + ++b + ++c); //12
					// 	 4 +  3 +  5

		/* 
		int a = 2;
		int b = ++a; //3
		System.out.print(++b + ++a); //8
					//	  4  + 4

		int a = 3; 
		int b = a++; //3(4)
		int c = a++; //4(5)
		System.out.print(a++ + b++ + c++ + a + b + c); //27
					//  5(6) + 3(4)+ 4(5)+ 6 + 4 + 5

		int a = 4;
		int b = 3;
		System.out.print(a++ + a + b++ + a + b); //21
					//	 4(5)+ 5 + 3(4)+ 5 + 4

		int a = 4;
		int b = a++; //4(5)
		int c = a;   //5
		System.out.print(a + b + c); //14
					//	 5 + 4 + 5

		int a = 5++; 
		System.out.print(a); //CTE: unexpected type

		int c = 3;
		int d = c++; //3(4)
		int e = d++; //3(4)
		System.out.println(c++ + d++ + e++); //11
					  4(5)+ 4(5)+ 3(4)	 
		System.out.println(c+d); //10

		int c = 3;
		int d = c++; //3(4)
		int e = d++; //3(4)
		System.out.println(c++ + c++ + c++ + c - c++); //15
						// 4(5)+ 5(6)+ 6(7)+ 7 - 7(8)

		System.out.println(c + c++ + c++ + c); //35
						// 8 + 8(9)+9(10)+10

		System.out.print(c++ + c + c++); //32
					  //10(11)+ 11+ 11(12) 
		*/

	}
}