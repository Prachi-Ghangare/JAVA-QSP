class Human{
	String name;
	String gender;

	Human(String name,String gender){
		super();
		this.name = name;
		this.gender = gender;
	}

	public void eat(){ 
		System.out.println(name+" can eat");
	}

	public void walk(){
		System.out.println(name+" can walk");
	}

	public void think(){
		System.out.println(name+" can think");
	}

	public void speak(){
		System.out.println(name+" can speak");
		System.out.println();
	}
	public void displayHuman(){
		System.out.println("***** Human Details ******");
		System.out.println("Name:"+this.name);
		System.out.println("Gender:"+this.gender);
		System.out.println();
	}
}

class Graduation extends Human{
	String course;
	int duration;
	String branch;
	String university;
	int yop;

	Graduation(String course,int duration,String branch,String university,int yop,String name,String gender){
		super( name, gender);
		this.course = course;
		this.duration = duration;
		this.branch = branch;
		this.university = university;
		this.yop = yop;
	}

	public void displayGradution(){
		System.out.println("****** Graduation Details ******");
		System.out.println("Course :"+this.course);
		System.out.println("Duration:"+this.duration+"yrs");
		System.out.println("Branch:"+this.branch);
		System.out.println("University:"+this.university);
		System.out.println("Year of Passing:"+this.yop);
		System.out.println();
	}
}

class PostGraduation extends Graduation{
	String specialization;
	int durationpg;
	int yoppg;
	String universitypg;

	PostGraduation(String specialization,int durationpg,int yoppg,String universitypg,String course,int duration,String branch,String university,int yop,String name,String gender){
		super( course, duration, branch, university, yop, name, gender);
		this.specialization = specialization;
		this.durationpg = durationpg;
		this.yoppg = yoppg;
		this.universitypg = universitypg;
	}

	public void displayPostGraduation(){
		System.out.println("****** Post Graduation Details *******");
		System.out.println("Specialization:"+this.specialization);
		System.out.println("Duration:"+this.durationpg+" yrs");
		System.out.println("Year of Passing:"+this.yoppg);
		System.out.println("University:"+this.universitypg);
		System.out.println();
	}
}

class Job extends PostGraduation{
	String company;
	double sal;
	String role;
	String loc;

	Job(String company,double sal,String role,String loc,String specialization,int durationpg,int yoppg,String universitypg,String course,int duration,String branch,String university,int yop,String name,String gender){
		super( specialization, durationpg, yoppg, universitypg, course, duration, branch, university, yop, name, gender);
		this.company = company;
		this.sal = sal;
		this.role = role;
		this.loc = loc;
	}

	public void displayJob(){
		System.out.println("***** Job Details ******");
		System.out.println("Comapany Name:"+this.company);
		System.out.println("Salary:"+this.sal+"lakhs");
		System.out.println("Designation:"+this.role);
		System.out.println("Location:"+this.loc);
		System.out.println();
	}

}

class MultilevelDriver{
	public static void main(String[] args) {
		Job obj = new Job("TCS",7,"Ass.Software Engineer","Pune","Cyber Security",2,2026,"SPPU","B.Tech",4,"CS","SPPU",2024,"Ramesh","Male");
		obj.displayHuman();
		obj.eat();
		obj.walk();
		obj.think();
		obj.speak();
		obj.displayGradution();
		obj.displayPostGraduation();
		obj.displayJob();

	}
}