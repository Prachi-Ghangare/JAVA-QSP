class Parent{
	String name = "Ramesh";
	String dob = "01/01/1990";
	Child cobj = new Child(); 

	void displayParent(){
		System.out.println("*** Parent Details ***");
		System.out.println("Name : "+name);
		System.out.println("DOB : "+dob);
	}
}
class Child{
	String name = "chintu";
	String dob = "01/07/2010";

	void displayChild(){
		System.out.println();
		System.out.println("*** Child Details ***");
		System.out.println("Name : "+name);
		System.out.println("DOB : "+dob);
	}
}

class CompositionEx{
	public static void main(String[] args) {
		Parent p = new Parent();
		p.displayParent();
		p.cobj.displayChild();
	}
}