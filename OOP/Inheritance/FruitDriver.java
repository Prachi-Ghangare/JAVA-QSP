class Fruit{
	String name;
	String season;
	String colour;
	boolean spines;
	boolean seeds;
	String seedColour;

	Fruit(String name,String season,String colour,boolean spines,boolean seeds,String seedColour){
		super();
		this.name = name;
		this.season = season;
		this.colour = colour;
		this.spines = spines;
		this.seeds = seeds;
		this.seedColour = seedColour;
	}

	public void displayFruit(){
		System.out.println("***** Fruit Details *****");
		System.out.println("Name:"+this.name);
		System.out.println("Season:"+this.season);
		System.out.println("Colour:"+this.colour);
		System.out.println("Does it has spines? "+this.spines);
		System.out.println("Is it seedless or not? "+this.seeds);
		System.out.println("Color of Seed:"+this.seedColour);
		System.out.println();
	}
}

class Mango extends Fruit{
	double price;
	String type;
	String famousCity;
	String peelColour;

	Mango(double price,String type,String famousCity,String peelColour,String name,String season,String colour,boolean spines,boolean seeds,String seedColour){
		super(name,season,colour,spines,seeds,seedColour);
		this.price = price;
		this.type = type;
		this.famousCity = famousCity;
		this.peelColour = peelColour;
	}

	public void displayMango(){
		System.out.println("***** Mango Details *****");
		System.out.println("Price:"+price);
		System.out.println("Type:"+type);
		System.out.println("Famous City:"+famousCity);
		System.out.println("peelColour:"+peelColour);
		System.out.println();
	}
}

class FruitDriver{
	public static void main(String[] args) {
		Mango obj = new Mango(400,"Hapus","Ratnagiri","Yellow","Mango","Summer","Yellow",false,true,"White");
		obj.displayFruit();
		obj.displayMango();
	}
}