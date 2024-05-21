class Mobile{
	String brand;
	String model;
	int ram;
	int rom;
	double price;

	Mobile(String brand,String model,int ram,int rom,double price){
		super();
		this.brand = brand;
		this.model = model;
		this.ram = ram;
		this.rom = rom;
		this.price = price;
	}

	void displayMobile(){
		System.out.println("Brand: "+this.brand);
		System.out.println("Model: "+this.model);
		System.out.println("RAM: "+this.ram+"gb");
		System.out.println("ROM: "+this.rom+"gb");
		System.out.println("Price:Rs. "+this.price);
	}
}

class SmartPhone extends Mobile{
	int battery;
	String processor;
	int camera;

	SmartPhone(int battery,String processor,int camera,String brand,String model,int ram,int rom,double price){
		super(brand,model,ram,rom,price);
		this.battery = battery;
		this.processor = processor;
		this.camera = camera;
	}

	public void displaySmartPhone(){
		displayMobile();
		System.out.println("Battery:"+this.battery+"mAh");
		System.out.println("Processor:"+this.processor);
		System.out.println("Front Camera :"+this.camera+"MP");
	}
}

class Samsung extends SmartPhone{
	double display;
	String simType;

	Samsung(double display,String simType,int battery,String processor,int camera,String brand,String model,int ram,int rom,double price){
		super(battery,processor,camera,brand,model,ram,rom,price);
		this.display = display;
		this.simType = simType;
	}

	public void displaySamsung(){
		displayMobile();
		displaySmartPhone();
		System.out.println("Display size:"+this.display);
		System.out.println("SIM Type:"+this.simType);
		System.out.println();
	}
}

class MobileDriver{
	public static void main(String[] args) {
		Samsung obj = new Samsung(6.5,"Dual SIM",5000,"G80",32,"SAMSUNG","SAMSUNG A53",8,128,40000);
		System.out.println("***** Mobile Details *****");
		obj.displayMobile();
		System.out.println();
		System.out.println("***** SmartPhone Details *****");
		obj.displaySmartPhone();
		System.out.println();
		System.out.println("***** Samsung Details *****");
		obj.displaySamsung();
	}
}