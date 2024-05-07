class University{
	String name;
	String uniCode;
	int noOfColleges;
	String type;
	int establishedYear;
	int course;
	College college;

	University(String name,String uniCode,int noOfColleges,String type,int establishedYear,int course){
		this.name = name;
		this.uniCode =uniCode;
		this.noOfColleges = noOfColleges;
		this.type = type;
		this.establishedYear = establishedYear;
		this.course = course;
	}

	public void displayUniversity(){
		System.out.println("*****University Details*****");
		System.out.println("Name:"+this.name);
		System.out.println("University Code:"+this.uniCode);
		System.out.println("No of colleges:"+this.noOfColleges);
		System.out.println("Type of University:"+this.type);
		System.out.println("Year of establishment:"+this.establishedYear);
		System.out.println("No of courses:"+course);
		System.out.println();
	}

	public void createInstanceOfCollege(String name,int collegeCode,String addr,int noOfDept,String grade,int staff){
		college = new College(name,collegeCode,addr,noOfDept,grade,staff);
	}
}

class College{
	String name;
	int collegeCode;
	String addr;
	int noOfDept;
	String grade;
	int staff;
	Department dept;

	College(String name,int collegeCode,String addr,int noOfDept,String grade,int staff)
	{
		this.name = name;
		this.collegeCode  =collegeCode;
		this.addr = addr;
		this.noOfDept = noOfDept;
		this.grade = grade;
		this.staff = staff;
	}

	public void displayCollege(){
		System.out.println("******College Details*****");
		System.out.println("Name:"+this.name);
		System.out.println("college Code:"+this.collegeCode);
		System.out.println("Address:"+this.addr);
		System.out.println("No. Of Department:"+this.noOfDept);
		System.out.println("Grade:"+this.grade);
		System.out.println("No .of staff:"+this.staff);
		System.out.println();
	}

	public void createInstanceOfDept(String name,String hod,int classrooms,int staff,int subjects){
		dept = new Department(name,hod,classrooms,staff,subjects); 
	}
}

class Department{
	String name;

	String hod;
	int classrooms;
	int staff;
	int subjects;
	Teacher teacher;

	Department(String name,String hod,int classrooms,int staff,int subjects){
		this.name = name;
		this.hod = hod;
		this.classrooms = classrooms;
		this.staff =staff;
		this.subjects = subjects;
	}

	public void displayDepartment(){
		System.out.println("*****Department Details*****");
		System.out.println("Name:"+name);
		System.out.println("HOD:"+hod);
		System.out.println("NO of classrooms:"+classrooms);
		System.out.println("No of staffs:"+staff);
		System.out.println("No of subjects:"+subjects);
		System.out.println();
	}

	public void createInstanceOfTeacher(String name,String subject,long phoneNo,String qualification,String experience){
		teacher = new Teacher(name,subject,phoneNo,qualification,experience);
	}
}

class Teacher{
	String name;
	String subject;
	long phoneNo;
	String qualification;
	String experience;

	Teacher(String name,String subject,long phoneNo,String qualification,String experience){
		this.name = name;
		this.subject = subject;
		this.phoneNo = phoneNo;
		this.qualification = qualification;
		this.experience =experience;
	}

	public void displayTeacher(){
		System.out.println("*****Teacher Details******");
		System.out.println("Name:"+name);
		System.out.println("Subject:"+subject);
		System.out.println("Phone No."+phoneNo);
		System.out.println("Qualification:"+qualification);
		System.out.println("Experience:"+experience);
		System.out.println();
	}
}
class AggregationEx{
	public static void main(String[] args) {
		University obj = new University("SRTMUN","SRT123",100,"STATE",1990,50);
		obj.displayUniversity();
		obj.createInstanceOfCollege("DSCL",123,"BARSHI ROAD,LATUR",10,"A+",50);
		obj.college.displayCollege();
		obj.college.createInstanceOfDept("Chem","Sarnikar",4,10,3);
		obj.college.dept.displayDepartment();
		obj.college.dept.createInstanceOfTeacher("Angulwar","Chem",1233456780,"MSC ,phd","10");
		obj.college.dept.teacher.displayTeacher();
	}
}