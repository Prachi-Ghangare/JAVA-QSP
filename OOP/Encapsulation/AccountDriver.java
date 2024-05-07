import java.util.*;
class Account{
	private String accHolderName,addr,panNo;
	private long adharNo,phoneNo;
	private double bal;
	private int upiPin;

	Scanner sc = new Scanner(System.in);

	Account(String accHolderName,String addr,String panNo,long adharNo,long phoneNo,double bal, int upiPin ){
		this.accHolderName = accHolderName;
		this.addr = addr;
		this.panNo = panNo;
		this.adharNo = adharNo;
		this.phoneNo = phoneNo;
		this.bal = bal;
		this.upiPin = upiPin;
	}

	public void display(){
		System.out.println("Account Holder Name:"+accHolderName);
		System.out.println("Address:"+addr);
		System.out.println("Adhar Number:"+adharNo);
		System.out.println("PAN Number:"+panNo);
		System.out.println("Phone Number:"+phoneNo);
	}

	public String getName(){
		return accHolderName;
	}

	public void setHolderName(String uname){
		this.accHolderName = uname;
		System.out.println("Name updated Successfully");
	}

	public String getAddr(){
		return addr;
	}

	public void setAddr(String uaddr){
		this.addr = uaddr;
		System.out.println("Address updated Successfully");
	}

	public String getPanNo(){
		return panNo;
	}

	public long getAdharNo(){
		return adharNo;
	}

	public long getPhoneNo(){
		return phoneNo;
	}

	public void setPhoneNo(long uphoneNo){
		this.phoneNo = uphoneNo;
		System.out.println("Phone number updated Successfully");
	}

	public void setUpi(int uupi){
		this.upiPin = uupi;
		System.out.println("UPI PIN Updated Successfully");
	} 

	public double getBalance(){
		System.out.print("Enter pin:");
		int uupi = sc.nextInt();
		if(uupi == upiPin)
			return bal;
		else{
			System.out.println("Wrong upi pin");
			return 0;
		}
	}

	public void deposit(double amount){
		bal = bal +amount;
		System.out.println("Amount deposited Successfully");
		System.out.print("Updated balance:"+bal);
	}

	public void withdraw(double amount){
		if(bal>=amount){
			bal = bal-amount;
			System.out.println("Amount withdraw Successfully");
			System.out.print("Updated balance:"+bal);
		}
		else
			System.out.println("Insufficient Balance. Withdrawal Failed");
	}
}

class AccountDriver{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account obj = null;
		double bal;

		outerLoop:
		for (; ; ) {
			System.out.println("1.Create Account");
			System.out.println("2.Existing User");
			System.out.println("3.Exit");
			System.out.print("Enter the choice:");
			int ch = sc.nextInt();

			switch(ch){
				case 1:{
					System.out.print("Enter your name:");
					String accHolderName = sc.nextLine();
					sc.nextLine();
					System.out.print("Enter Address:");
					String addr = sc.nextLine();
					System.out.print("Enter PAN No.:");
					String panNo = sc.nextLine();
					System.out.print("Enter Aadhar No.:");
					long adharNo = sc.nextLong();
					System.out.print("Enter Phone No.:");
					long phoneNo = sc.nextLong();
					System.out.print("Enter Balance:");
					bal = sc.nextDouble();
					System.out.print("Enter UPI PIN:");
					int pin = sc.nextInt();
					System.out.println("Account Created Successfully...");

					obj = new Account(accHolderName,addr,panNo,adharNo,phoneNo,bal,pin);
				}
				break;

				case 2:{
					System.out.println("1.Check Balance");
					System.out.println("2.Deposit Amount");
					System.out.println("3.Withdraw Amount");
					System.out.println("4.Update Account");
					System.out.println("5.Get Account Info");
					System.out.println("6.Logout");
					System.out.print("Enter your choice:");
					int ch1 = sc.nextInt();

					switch(ch1){
						case 1:{
							System.out.print("Balance is:"+obj.getBalance());
							break;
						}

						case 2:{
							System.out.print("Enter Deposit Amount:");
							double amt = sc.nextDouble();
							obj.deposit(amt);
						}
						break;

						case 3:{
							System.out.print("Enter amount to be withdraw:");
							double amt = sc.nextDouble();
							obj.withdraw(amt);
						}
						break;

						case 4:{
							System.out.println("1.Account Holder Name");
							System.out.println("2.Address");
							System.out.println("3.Phone Number");
							System.out.println("4.UPI PIN");
							System.out.println("Choose option to Update");
							int opt = sc.nextInt();

							switch(opt){
								case 1:{
									System.out.print("Enter new name:");
									String uname = sc.nextLine();
									obj.setHolderName(uname);
								}
								break;

								case 2:{
									System.out.print("Enter new Address");
									String uaddr = sc.nextLine();
									obj.setAddr(uaddr);
								}
								break;

								case 3:{
									System.out.print("Enter new Phone Number");
									long uphone = sc.nextLong();
									obj.setPhoneNo(uphone);
								}
								break;

								case 4:{
									System.out.print("Enter new upi pin");
									int uupi = sc.nextInt();
									obj.setUpi(uupi);
								}
								break;

								default:
									System.out.println("Invalid Option !");
							}
						}
						break;

						case 5:{
							obj.display();
						}
						break;

						case 6:{
							System.out.println("Logout Successfully");
							System.exit(0);
						}
						break;

						default:
							System.out.println("Invalid Option !");
					}											
				}

				case 3:
					// break outerLoop;
					System.exit(0);

				default:
					System.out.println("Invalid Option !");
			}
		}
	}
}