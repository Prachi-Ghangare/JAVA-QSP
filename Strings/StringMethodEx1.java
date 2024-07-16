import java.util.*;
class StringMethodEx1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next().toLowerCase();
		// String name1=name.substring(0,1).toUpperCase();
		// String name2=name.substring(1,name.length());
		// System.out.println(name1.concat(name2));
		String name3=name.substring(3);
		System.out.println(name3);
	}
}