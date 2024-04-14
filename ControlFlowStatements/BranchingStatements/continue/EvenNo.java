class EvenNo{
	public static void main(String[] args) {
		evenloop:
		for(int i=1;i<=100;i++){
			if(i%2!=0)
				continue evenloop;
			System.out.print(i+" ");
		}

		/*for(int i=1;i<=100;i++){
			if(i%2!=0)
				continue;
			System.out.print(i+" ");
		}*/
	}
}