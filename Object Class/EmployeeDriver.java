//Overriding of finalize()

class Employee{
	String name;
	String role;
	Employee(String name,String role){
		this.name=name;
		this.role=role;
	}
	protected void finalize(){
		System.out.println("Object got destroyed");
	} 
}

class EmployeeDriver{
	public static void main(String[] args) {
		Employee obj = new Employee("Ramesh","Product Manager");
		System.out.println(obj);
		obj=null; //dereferencing the obj
		System.gc();
		System.out.println(obj.name);
	}
}