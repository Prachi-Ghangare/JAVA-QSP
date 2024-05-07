class DoWhileEx{
	public static void main(String[] args) {
		//Syntax
		// initialization
		// do{
		// 	//statements
		// 	updation;
		// }while(condition);
		
		int i=1;
		do{
			System.out.println("Hello"); //5 times hello
			i++;
		}while(i<=5);

		// int i=1;
		// do{
		// 	System.out.print("Hello"+i);
		// 	i++;
		// }while(i<1) //CTE: ';' expected

		// int i=1;
		// do{
		// 	System.out.print("Hello"+i); //print hello 1 only
		// 	i++;
		// }while(i<1);

		// int i=1;
		// do{
		// 	System.out.print("Hello"+i);
		// 	i++;
		// }while(i<1) //CTE: ';' expected

		// int i;
		// do{
		// 	i=1;
		// 	System.out.print("Hello"); //infinite loop
		// 	i++;
		// }while(i<=5);

		// int i=1;
		// do
		// 	System.out.print("Hello"); //infinite loop,need update statement
		// while(i<=5);


		// int i=1;
		// do
		// 	System.out.print("Hello"); //CTE: while expected
		// 	System.out.print("hii");
		// while(i<=5);

		// int i=1;
		// do
		// 	int b=1; // variable declaration not allowed here
		// while(i<=5);

		// int i;
		// do
		// 	i=10; //blank o/p
		// while(i<=5);
	}
}