import java.util.*;
class Loan{
	String bank;
	String accHolderName;
	long accNum;
	String branch;
	String address;
	double amt;
	int duration;
	double roi;

	Loan(String bank,String accHolderName,long accNum,String branch,String address,double amt,int duration,double roi){
		super();
		this.bank = bank;
		this.accHolderName = accHolderName;
		this.accNum = accNum;
		this.branch = branch;
		this.address = address;
		this.amt = amt;
		this.duration = duration;
		this.roi = roi;
	}

	public void displayLoan(){
		System.out.println("Loan Borrower's Details : \nBank Name - "+this.bank+" \nName - "+this.accHolderName+
			"\nAccount Number - "+this.accNum+" \nBranch - "+this.branch+" \nAddress - "+this.address+" \nLoan Amount"+
			this.amt+" \nDuration - "+this.duration+"years \nRate of Interest - "+this.roi);
	}
}

class Education extends Loan{
	String education;
	int period;
	String clgName;
	double fees;
	String addr;

	Education(String education,int period,String clgName,double fees,String addr,String bank,String accHolderName,long accNum,String branch,String address,double amt,int duration,double roi)
	{
		super(bank,accHolderName,accNum,branch,address,amt,duration,roi);
		this.education = education;
		this.period = period;
		this.clgName = clgName;
		this.fees = fees;
		this.addr = addr;
	}

	public void displayEducation(){
		System.out.println("Education Loan details: Type of Education - "+this.education+" Period - "+this.period+
			"College name - "+this.clgName+" Fees - "+this.fees+" Address - "+this.address);
	}
}
class Home extends Loan{
	String homeAddress;
	String propertyOwner;
	double hprice;

	Home(String homeAddress,String propertyOwner,double hprice,String bank,String accHolderName,long accNum,String branch,String address,double amt,int duration,double roi){
		super(bank,accHolderName,accNum,branch,address,amt,duration,roi);
		this.homeAddress = homeAddress;
		this.propertyOwner = propertyOwner;
		this.hprice = hprice;
	}
	public void displayHome(){
		System.out.println("Home load details: Home Address - "+this.homeAddress+" PropertyOwner name - "+this.propertyOwner+" Price - "+this.hprice);
	}
}

class Car extends Loan{
	String brand;
	String model;
	double cprice;

	Car(String brand,String model,double cprice,String bank,String accHolderName,long accNum,String branch,String address,double amt,int duration,double roi){
		super(bank,accHolderName,accNum,branch,address,amt,duration,roi);
		this.brand = brand;
		this.model = model;
		this.cprice = cprice;
	}
	public void displayCar(){
		System.out.println("Car loan details: \nBrand - "+this.brand+" \nModel - "+this.model+" \nCar price - "+this.cprice);
	}
}
class LoanDriver{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Loan l = new Loan("SBI","Ramesh Kumar",987596865432l,"SBI Pune","Deccan Pune",1500000,5,9.5);
		// l.displayLoan();
		for (; ; ) {
			System.out.println("***** Welcome ******");
			System.out.println("1.Education Loan\n2.Home Loan\n3.Car Loan\n4.Other\n5.Exit");
			System.out.println("choose an option: ");
			int opt = sc.nextInt();
			switch(opt){
				case 1:{
					Education e = new Education("Engineering",4,"JSPM",120000,"Narhe,Pune","SBI","Ramesh Kumar",987596865432l,"SBI Pune","Deccan Pune",110000,4,4.5);
					e.displayLoan();
					e.displayEducation();
					break;
				}
				case 2:{
					Home h = new Home("Karvenagar","Raj Malhotra",1500000,"HDFC","Shivani",893745349081l,"HDFC Latur","MG Road Latur",100000,2,8.5);
					h.displayLoan();
					h.displayHome();
					break;
				}
				case 3:{
					Car c = new Car("Hyundai","Creta",1400000,"BOM","Umesh",768957034032l,"BOM kopargaon","Gandhinagar",1200000,3,12.5);
					c.displayLoan();
					c.displayCar();
				}
				case 4:{
					System.out.println("Our team will get back to you "+((char)3));
					break;
				}
				case 5:{
					System.exit(0);
				}
				default:
					System.out.println("Invalid option");
			}
		}
	}
}