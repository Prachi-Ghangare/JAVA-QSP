class ContinueEx{
	public static void main(String[] args) {
		//if no. divisible by 5 skip the no.
		for(int i=1;i<=100;i++){
			if(i%5==0)
				continue;
			System.out.print(i+" ");
		}

		/*for(int i=1;i<=100;i++)
			continue;
		System.out.print(i+" "); //CTE: unreachable statement
		*/
	}
}