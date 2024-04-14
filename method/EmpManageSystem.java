// This System id designed for only one employee and that employee will have eid as 1.

import java.util.Scanner;
class EmpManageSystem{
	static String ename;
	static int eid;
	static String erole;
	static double esal;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***** WELCOME *****");
		System.out.println();
		features:
		for (; ; ) {
			System.out.println("FEATURES");
			System.out.println();
			System.out.println("1.Add New Emoloyee");
			System.out.println("2.View Emoloyee");
			System.out.println("3.Edit the Emoloyee");
			System.out.println("4.Exit");
			System.out.println("Enter an option:");
			int opt = sc.nextInt();
			switch(opt){
				case 1:{
					addNewEmp();
					break;
				}
				case 2:{
					System.out.println("Enter an employee id:");
					int eid1= sc.nextInt();
					viewEmp(1);
					break;
				}
				case 3:{
					editEmp();
					break;
				}
				case 4:{
					System.exit(0);
					break;
				}
				default:{
					System.out.println("Invalid Option");
				}
			}
		}
	}

	public static void addNewEmp(){
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter Employee Name:");
		ename = sc1.nextLine();
		System.out.print("Enter Employee Id:");
		eid = sc1.nextInt();
		sc1.nextLine();
		System.out.print("Enter Employee Role:");
		erole = sc1.nextLine();
		System.out.print("Enter Employee Salary:");
		esal = sc1.nextDouble();
		System.out.println("Employee Added Successfully..");
		System.out.println();
	}

	public static void viewEmp(int eid1){
		if(eid==eid1){
			System.out.println("Employee Data:");
			System.out.println("Name:"+ename);
			System.out.println("Id:"+eid);
			System.out.println("Role:"+erole);
			System.out.println("Salary:"+esal);
			System.out.println();
		}
		else{
			System.out.println("Wrong EID");
			System.out.println();
		}
	}

	public static void editEmp(){
		Scanner sc2 = new Scanner(System.in);
		editData:
		for (; ; ) {
			System.out.println();
			System.out.println("Choose the option to edit the data:");
			System.out.println("1.Edit Name");
			System.out.println("2.Edit Role");
			System.out.println("3.Edit Salary");
			System.out.print("Enter an option:");
			int opt =sc2.nextInt();
			switch(opt){
				case 1:{
					System.out.print("Enter new name:");
					sc2.nextLine();
					String nname = sc2.nextLine();
					editName(nname);
					break editData;
				}
				case 2:{
					System.out.print("Enter new role:");
					sc2.nextLine();
					String nrole = sc2.nextLine();
					editRole(nrole);
					break editData;
				}
				case 3:{
					System.out.print("Enter revised Salary:");
					sc2.nextLine();
					double nsal = sc2.nextDouble();
					editSalary(nsal);
					break editData;
				}
				default:{
					System.out.println("Invalid Option");
					break editData;
				}
			}
		}
	}

	public static void editName(String nname){
		ename = nname;
		System.out.println("Name Updated Successfully");
	}

	public static void editRole(String nrole){
		erole = nrole;
		System.out.println("Role Updated Successfully");
	}

	public static void editSalary(double nsal){
		esal = nsal;
		System.out.println("Salary Updated Successfully");
	}	
}