//Write a program to print UpperCase character, LowerCase character, digits in Ascending and Descending Order

class CharPrint1{
	public static void main(String[] args) {

		for(char ch = 'A' ; ch <= 'Z' ; ch++){
			System.out.print(ch+" ");
		}
		System.out.println();

		for(char ch = 97 ; ch <= 122 ; ch++){
			System.out.print(ch+" ");
		}
		System.out.println();
		
		for(char ch = 48 ; ch <= '9' ; ch++){
			System.out.print(ch+" ");
		}
		System.out.println();

		for(char ch = 'Z' ; ch >= 'A' ; ch--){
			System.out.print(ch+" ");
		}
		System.out.println();
		
		for(char ch = 122 ; ch >= 97 ; ch--){
			System.out.print(ch+" ");
		}
		System.out.println();

		for(char ch = 57 ; ch >= '0' ; ch--){
			System.out.print(ch+" ");
		}
		
	}
}