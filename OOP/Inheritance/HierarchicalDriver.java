class Engineering{
	int noOfStreams;
	int noOfStaffs;
	int noOfStudents;
	String director;
	String clgName;

	Engineering(int noOfStreams,int noOfStaffs,int noOfStudents,String director,String clgName)
	{
		super();
		this.noOfStreams = noOfStreams;
		this.noOfStaffs = noOfStaffs;
		this.noOfStudents = noOfStudents;
		this.director = director;
		this.clgName = clgName ;
	}

	public void displayEngineering(){
		System.out.println("***** Engineering Details *****");
		System.out.println("Number of Streams:"+this.noOfStreams);
		System.out.println("Number of Staffs:"+this.noOfStaffs);
		System.out.println("Number of Students:"+this.noOfStudents);
		System.out.println("Directer Name:"+this.director);
		System.out.println("College Name:"+this.clgName);
		System.out.println();
	}
}

class ComputerScience extends Engineering{
	int cs_students;
	int cs_staffs;
	String cs_hod;
	int cs_classes;
	int cs_sub;

	ComputerScience(int cs_students,int cs_staffs,String cs_hod,int cs_classes,int cs_sub,int noOfStreams,int noOfStaffs,int noOfStudents,String director,String clgName){
		super(noOfStreams,noOfStaffs,noOfStudents,director,clgName);
		this.cs_students = cs_students;
		this.cs_staffs = cs_staffs;
		this.cs_hod = cs_hod;
		this.cs_classes = cs_classes;
		this.cs_sub = cs_sub;
	}

	public void displayCs(){
		System.out.println("***** Computer Engineering Details******");
		System.out.println("Number of Students : "+this.cs_students);
		System.out.println("Number of Staffs:"+this.cs_staffs);
		System.out.println("HOD Name:"+cs_hod);
		System.out.println("Number of Classes:"+this.cs_classes);
		System.out.println("Number of Subjects:"+cs_sub);
		System.out.println();
	}
}

class Civil extends Engineering{
	int civ_students;
	int civ_staffs;
	String civ_hod;
	int civ_classes;
	int civ_sub;

	Civil(int civ_students,int civ_staffs,String hod,int classes,int civ_sub,int noOfStreams,int noOfStaffs,int noOfStudents,String director,String clgName){
		super(noOfStreams,noOfStaffs,noOfStudents,director,clgName);
		this.civ_students = civ_students;
		this.civ_staffs = civ_staffs;
		this.civ_hod = civ_hod;
		this.civ_classes = civ_classes;
		this.civ_sub = civ_sub;
	}

	public void displayCivil(){
		System.out.println("***** Civil Engineering Details******");
		System.out.println("Number of Students : "+this.civ_students);
		System.out.println("Number of Staffs:"+this.civ_staffs);
		System.out.println("HOD Name:"+civ_hod);
		System.out.println("Number of Classes:"+this.civ_classes);
		System.out.println("Number of Subjects:"+civ_sub);
		System.out.println();
	}
}

class Mechanical extends Engineering{
	int mech_students;
	int mech_staffs;
	String mech_hod;
	int mech_classes;
	int mech_sub;

	Mechanical(int mech_students,int mech_staffs,String mech_hod,int mech_classes,int mech_sub,int noOfStreams,int noOfStaffs,int noOfStudents,String director,String clgName){
		super(noOfStreams,noOfStaffs,noOfStudents,director,clgName);
		this.mech_students = mech_students;
		this.mech_staffs = mech_staffs;
		this.mech_hod = mech_hod;
		this.mech_classes = mech_classes;
		this.mech_sub = mech_sub;
	}

	public void displayMech(){
		System.out.println("***** Mechanical Engineering Details******");
		System.out.println("Number of Students : "+this.mech_students);
		System.out.println("Number of Staffs:"+this.mech_staffs);
		System.out.println("HOD Name:"+mech_hod);
		System.out.println("Number of Classes:"+this.mech_classes);
		System.out.println("Number of Subjects:"+mech_sub);
		System.out.println();
	}
}


class HierarchicalDriver{
	public static void main(String[] args) {
		ComputerScience obj1 = new ComputerScience(200,25,"Dr.D.B.Kshirsagar",8,40,7,300,1200,"Dr.A.G.Thakur","SCOE,Kopergaon");
		Civil obj2 = new Civil(90,20,"Dr.S.K.Sharma",5,35,7,300,1200,"Dr.A.G.Thakur","SCOE,Kopergaon");
		Mechanical obj3 = new Mechanical(120,27,"Dr.A.S.Bodhe",6,41,7,300,1200,"Dr.A.G.Thakur","SCOE,Kopergaon");
		obj1.displayEngineering();
		obj1.displayCs();
		obj2.displayCivil();
		obj3.displayMech();
	}
}