//Overriding of toString()

class Human{
	String name;
	String place;
	String gender;
	String profession;
	Human(String name,String place,String gender,String profession){
		this.name = name;
		this.place = place;
		this.gender = gender;
		this.profession = profession;
	}

	public String toString(){
		return "Name - "+this.name+" Place - " +this.place+" Gender - "+this.gender+" Profession - "+this.profession;
	}
}

class ObjectDriver1{
	public static void main(String[] args) {
		Human obj1 = new Human("Ramesh","Pune","Male","Doctor");
		System.out.println(obj1);
	}
}