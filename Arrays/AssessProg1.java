//find nearest prime no.s of given num & check the distance of that no. whichever distance is less return that no. If distance is same then return both no.s
// i/p - 32        i/p - 9
// o/p - 31        o/p - 7 11

class AssessProg1{
	public static void main(String[] args) {
		int num = 9;
		int prev = 0,next=0;
		for(int i=2;;i++)
		{
			if(isPrime(i))
			{
				if(i<num){
					prev=i;
				}
				else{
					next=i;
					break;
				}
			}
		}
		if(num-prev==next-num)
			System.out.println(prev+" "+next);
		else if(num-prev<next-num)
			System.out.println(prev);
		else
			System.out.println(next);
	}
	public static boolean isPrime(int num) {
		for(int j=2;j<num;j++){
			if(num%j==0){
				return false;
			}
		}
		return true;
	}
}