class PostEx{
	public static void main(String[] args) {
		// char ch = 'a'; //97
		// int a = ++ch;  //98
		// int b = --ch;  //97
		// int c = ch++;  //97(98)
		// System.out.print(ch + ++a + b-- + --c + c); //486
		// 			//	 98 + 99  +97(98)+ 96 + 96 

		// int a = 'a'; //97
		// int b = --a; //96(96)
		// int c = 'a'; //97
		// System.out.print(a++ + 'a' + --b + --c); //384
		// 			//	96(97)+ 97 + 95  +  96

		// int a = 3;
		// int b = ++a; //4(4)
		// int c = --b; //3(3)
		// System.out.print(++a + a-- + b-- + --c); //15
		// 			//	 5   + 5(4)  + 3(4)  + 2

		// int a = 4;
		// System.out.print(++a + a-- + a++ + --a); //18
		// 			//	  5  + 5(4)+ 4(5) + 4

		int a = 2;
		int b = a--; //2(1)
		int c = ++a; //2(2)
		System.out.print(a+b+c); //6
					//	 2+2+2
	}
}