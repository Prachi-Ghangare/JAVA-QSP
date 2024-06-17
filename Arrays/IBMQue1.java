import java.util.*;
class IBMQue1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the size of an array: ");
		// int size = sc.nextInt();
		// int [][] arr = new int[size][size];
		// for(int i=0;i<arr.length;i++){
		// 	for(int j=0;j<a[i].length;j++){
		// 		arr[j]=sc.next();
		// 	}
		// }

		System.out.println("Enter a string: ");
		String sen = sc.nextLine();
		String word = "";
		int i=0;
		outerloop:
		for(;;){
			for(;i<sen.length();i++){
				char ch = sen.charAt(i);
				if(ch==' '){
					i+=1;
					break outerloop;
				}
				word+=ch;
			}		
		}
		System.out.println(word);
	}
}