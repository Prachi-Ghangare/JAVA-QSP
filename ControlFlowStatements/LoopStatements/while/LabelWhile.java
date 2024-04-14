class LabelWhile{
	public static void main(String[] args) {
		int i=1;
		outerloop:
		while(i<=5){
			if(i==2)
				break outerloop;
			System.out.print(i); // prints 1
			i++;
		}

		/*outerloop:{
			int i=1;
			while(i<=5){
				if(i==2)
					break outerloop;
				System.out.print(i); // prints 1
				i++;
			}
		}*/

		/*outerloop:
			int i=1; //CTE:variable declaration not allowed
			while(i<=5){
				if(i==2)
					break outerloop;
				System.out.print(i); 
				i++;
			}*/

		/*int i;
		outerloop:{
			i=1; 
			while(i<=5){
				if(i==2)
					break outerloop; //prints 1
				System.out.print(i); 
				i++;
			}
		}*/

		/*int i;
		outerloop:
			i=1; 
			while(i<=5){
				if(i==2)
				{
					break; //prints 1
				}
				System.out.print(i); 
				i++;
			}*/

		/*int i;
		outerloop:{
			i=1; 
			while(i<=5){
				if(i==i)
					break outerloop; //blank output
				System.out.print(i); 
				i++;
			}
		}*/
	}
}