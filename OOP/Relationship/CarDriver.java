class Car{
	String brand;
	String modelNo;
	String type;
	double mil;
	int seatingCap;
	double price;
	Engine eng;
	// Engine eng = new Engine("CI",300,4,5);
	// Engine eng;

	Car(String brand,String modelNo,String type,double mil,int seatingCap,double price,String eType,int bhp,int noOfPiston,int gear){
	// Car(String brand,String modelNo,String type,double mil,int seatingCap,double price){
	// Car(String brand,String modelNo,String type,double mil,int seatingCap,double price,Engine eng){
		this.brand = brand;
		this.modelNo = modelNo;
		this.type = type;
		this.mil = mil;
		this.seatingCap =seatingCap;
		this.price = price;
		this.eng = new Engine(eType,bhp,noOfPiston,gear);
		// this.eng = eng;

		System.out.println("Car Object Created");

	}
	void displayCar(){
		System.out.println("****** Car Details ******");
		System.out.println("Brand: "+brand);
		System.out.println("Model No. : "+modelNo);
		System.out.println("Type : "+type);
		System.out.println("Mileage: "+mil+" km/l");
		System.out.println("Seating Capacity : "+seatingCap);
		System.out.println("Price : "+price+" rs");
	}
}

class Engine{
	String eType;
	int bhp;
	int noOfPiston;
	int gear;

	Engine(String eType,int bhp,int noOfPiston,int gear){
		this.eType = eType;
		this.bhp = bhp;
		this.noOfPiston = noOfPiston;
		this.gear = gear;
	}

	void displayEngine(){
		System.out.println();
		System.out.println("**** Engine Details ****");
		System.out.println("Type : "+eType);
		System.out.println("BHP : "+bhp);
		System.out.println("No of Pistons : "+noOfPiston);
		System.out.println("No of gears : "+gear);
	}
}

class CarDriver{
	public static void main(String[] args) {
		Car obj = new Car("TATA","NEXON","HATCHBACK",17,5,850000,"CI",300,4,5);
		// Car obj = new Car("TATA","NEXON","HATCHBACK",17,5,850000);
		// Car obj = new Car("TATA","NEXON","HATCHBACK",17,5,850000,(new Engine("CI",300,4,5)));
		obj.displayCar();
		// obj.eng.displayEngine();
	}
}