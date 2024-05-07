class Mobile{
	String brand;
	String model;
	int ram;
	int rom;
	double price;

	Mobile(String brand,String model,int ram,int rom,double price){
		this.brand = brand;
		this.model = model;
		this.ram = ram;
		this.rom = rom;
		this.price = price;
	}

	void display(){
		System.out.println("**** Mobile Details ****");
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("RAM: "+ram+"gb");
		System.out.println("ROM: "+rom+"gb");
		System.out.println("Price:Rs. "+price);
	}
}


class MobileDriver{
	public static void main(String[] args) {
		Mobile obj1 = new Mobile("SAMSUNG","S23 ULTRA",8,12,130000);
		Mobile obj2 = new Mobile("NOKIA","C200",2,8,1000);
		obj1.display();
		obj2.display();
	}
}