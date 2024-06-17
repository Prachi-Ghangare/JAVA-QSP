//Overriding of toString() method

class Student{
	String name;
	String place;
	String branch;
	static int rollno=0;
	Student(String name,String place,String branch){
		this.name = name;
		this.place = place;
		this.branch = branch;
		rollno++;
	}
	public String toString(){
		return "HI MY NAME IS "+this.name+" I BELONGS TO "+this.place+" AND I HAVE COMPELETED "+this.branch+" ENGINEERING"+"AND MY ROLL NO. IS "+this.rollno;
	}

	public int hashCode(){
		return rollno;
	}
}

class Demo{
	public static void main(String[] args) {
			Student obj1 = new Student("RAMESH","PUNE","CIVIL");
			System.out.println(obj1);
			System.out.println(obj1.hashCode());
			Student obj2 = new Student("SURESH","NASHIK","MECHANICAL");
			System.out.println(obj2);
			System.out.println(obj2.hashCode());
			Student obj3 = new Student("GANESH","MUMBAI","CS");
			System.out.println(obj3);
			System.out.println(obj3.hashCode());
		}	
}