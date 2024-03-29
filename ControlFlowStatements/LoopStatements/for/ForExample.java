class ForExample{
	public static void main(String[] args) {
		//Syntax
		// for(init ; cond ; update){
		// 	//statements
		// }

		// for(;;); //blank output

		for(int i = 1;i<=5;i++){
			System.out.print(i+" "); //1 2 3 4 5
		}

		// for(int i = 1;i<=5;i++)
		// 	System.out.print(i+" "); //1 2 3 4 5

		// for(int i = 1;i<=5;)
		// 	System.out.println("Hello World "+ i++);

		// int i = 1;
		// for(;i<=5;){
		// 	System.out.print(i+" "); //1 2 3 4 5 
		// 	i++;
		// }

		// System.out.println("Execution Starts");
		// for(int i = 1;;i++){
		// 	System.out.print(i+" "); //Infinite loop
		// }
		// System.out.println("Execution Ends");//CTE: unreachable statement

		// System.out.println("Execution Starts");
		// boolean b = false;
		// for(int i = 1;b;i++){
		// 	System.out.print(i+" "); //won't execute
		// }
		// System.out.println("Execution Ends");

		// System.out.println("Execution Starts");
		// int i = 1;
		// boolean b = true;
		// for(;b;)
		// 	System.out.print(i+" "); //Infinite loop

		// System.out.println("Execution Starts");
		// int i = 1;
		// boolean b = false;
		// for(;b;)
		// 	System.out.print(i+" ");
		// System.out.print("Execution Ends");

		// for(byte i = 1;true;i--){
		// 	System.out.print(i+" "); //Infinite loop
		// }

		// for(int i=1;i<=5;i++)
		// 	break; // will execute gives blank output

		// for(int i=1;i<=5;i++);
		// 	System.out.print("Hello"); //print hello 1 time
		
	}
}