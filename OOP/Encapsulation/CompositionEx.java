class Car{
	String brand;
	String model;
	String type;
	double price;
	int sittingCapacity;
	Engine engine;

	Car(String brand,String model,String type,double price,int sittingCapacity,double horsePower,double capacity,String engineType,double mileage,int noOfPiston){
		this.brand= brand;
		this.model= model;
		this.type = type;
		this.price = price;
		this.sittingCapacity = sittingCapacity;
		this.engine = new Engine(horsePower,capacity,engineType,mileage,noOfPiston);
	}

	public void displayCar(){
		System.out.println("******Car Details******");
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Type of Car:"+type);
		System.out.println("Price:"+price);
		System.out.println("sitting Capacity:"+sittingCapacity);
		System.out.println();
	}
}

class Engine{
	double horsePower;
	double capacity;
	String engineType;
	double mileage;
	int noOfPiston;

	Engine(double horsePower,double capacity,String engineType,double mileage,int noOfPiston){
		this.horsePower = horsePower;
		this.capacity = capacity;
		this.engineType = engineType;
		this.mileage = mileage;
		this.noOfPiston = noOfPiston;
	}

	public void displayEngine(){
		System.out.println("******Details of Engine*******");
		System.out.println("Horse Power:"+horsePower);
		System.out.println("Capacity:"+capacity);
		System.out.println("Type of engine:"+engineType);
		System.out.println("mileage:"+mileage);
		System.out.println("No of Piston:"+noOfPiston);
		System.out.println();
	}
}

class CompositionEx{
	public static void main(String[] args) {
		Car obj= new Car("TATA","NEXON","SUV",900000,5,120,1.2,"Petrol",16,4);
		obj.displayCar();
		obj.engine.displayEngine();
	}
}