//Encapsulation Example
import java.util.*;
class PhonePay{
	String name;
	long phoneNo;
	private double bal;
	int pin;

	PhonePay(String name,long phoneNo,double bal,int pin){
		this.name=name;
		this.bal=bal;
		this.pin=pin;
	}
	public double getBalance(int upin){
		if(upin==pin)
			return bal;
		else
			return 0;
	}
}

class PhonePayDriver{
	public static void main(String[] args) {
		PhonePay obj = new PhonePay("Ramesh",9345738910l,50000,1234);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a pin:");
		int upin =sc.nextInt();
		System.out.println(obj.getBalance(upin));
	}
}