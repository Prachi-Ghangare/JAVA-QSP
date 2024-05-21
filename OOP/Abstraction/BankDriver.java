abstract class RBI{
	abstract void rateOfInterest();
	abstract void withdrawLimit();
	abstract void depositLimit();
}

abstract class SBI extends RBI{
	String uname;
	String accType;
	SBI(String uname,String accType){
		super();
		this.uname = uname;
		this.accType = accType;
	}

	void displayAccDetails(){
		System.out.println("***** Account Details ******");
		System.out.println("Account Holder Name:"+uname);
		System.out.println("Account Type:"+accType);
	}
}

class Saving extends SBI{
	Saving(String uname,String accType){
		super(uname,accType);
	}
	void rateOfInterest(){
		System.out.println("Rate of Interest: "+8.5+"%");
	}
	void withdrawLimit(){
		System.out.println("Withdraw Limit: "+50000+"Rs");
	}
	void depositLimit(){
		System.out.println("Deposit Limit: "+100000+"Rs");
		System.out.println();
	}
}

class Current extends SBI{
	Current(String uname,String accType){
		super(uname,accType);
	}
	void rateOfInterest(){
		System.out.println("Rate of Interest: "+8+"%");
	}
	void withdrawLimit(){
		System.out.println("Withdraw Limit: "+500000+"Rs");
	}
	void depositLimit(){
		System.out.println("Deposit Limit: "+1000000+"Rs");
		System.out.println();
	}
}

class BankDriver{
	public static void main(String[] args) {
		Saving obj1 = new Saving("Ramesh","Saving");
		obj1.displayAccDetails();
		obj1.rateOfInterest();
		obj1.withdrawLimit();
		obj1.depositLimit();

		Current obj2 = new Current("Ramesh","Saving");
		obj2.displayAccDetails();
		obj2.rateOfInterest();
		obj2.withdrawLimit();
		obj2.depositLimit();
	}
}