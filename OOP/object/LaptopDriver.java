class Laptop{
	String brand;
	String modelNumber;
	double price;
	int ram;
	int rom;
	String processor;
	String type;

	public void display() {
		System.out.println("****** LAPTOP DETAILS ******");
		System.out.println("Laptop brand : "+brand);
		System.out.println("Model Number : "+modelNumber);
		System.out.println("Price : "+"RS."+price);
		System.out.println("RAM : "+ram+"gb");
		System.out.println("ROM : "+rom+"gb");
		System.out.println("Processor : "+processor);
		System.out.println("Type : "+type);
	}
}

class LaptopDriver{
	public static void main(String[] args) {
		Laptop obj = new Laptop();
		Laptop obj1 = new Laptop();
		obj.brand = "HP";
		obj.modelNumber = "HP357i";
		obj.price = 60000;
		obj.ram = 8;
		obj.rom = 128;
		obj.processor = "i7";
		obj.type = "Gaming";
		obj.display();

		obj1.brand = "Dell";
		obj1.modelNumber = "dell123";
		obj1.price = 50000;
		obj1.ram = 8;
		obj1.rom = 512;
		obj1.processor = "i5";
		obj1.type = "Gaming";
		obj1.display();
	}
}