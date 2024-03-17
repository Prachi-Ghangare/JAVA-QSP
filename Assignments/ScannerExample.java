import java.util.Scanner;

class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string:");
        String a = sc.nextLine();       //nextLine prints whole string
        System.out.print("Enter 2nd string:"); 
        String b = sc.next();           //next prints first word only
        System.out.print("Enter a character:");
        char ch = sc.next().charAt(0);
        System.out.println("a - "+a);
        System.out.println("b - "+b);
        System.out.println("ch - "+ch);
    }
    
}
