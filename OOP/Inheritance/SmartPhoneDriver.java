class SmartPhone{
	String brand;
	int ram;
	int rom;
	int battery;
	String processor;
	int camera;

	SmartPhone(String brand,int ram,int rom,int battery,String processor,int camera){
		super();
		this.brand = brand;
		this.ram = ram;
		this.rom = rom;
		this.battery = battery;
		this.processor = processor;
		this.camera = camera;
	}

	public void displaySmartPhone(){
		System.out.println("***** SmartPhone Specification *****");
		System.out.println("Brand:"+this.brand);
		System.out.println("RAM:"+this.ram);
		System.out.println("ROM:"+this.rom);
		System.out.println("Battery:"+this.battery+"mAh");
		System.out.println("Processor:"+this.processor);
		System.out.println("Camera :"+this.camera+"MP");
		System.out.println();
	}
}

class Samsung extends SmartPhone{
	String model;
	double price;
	double display;
	String simType;

	Samsung(String model,double price,double display,String simType,String brand,int ram,int rom,int battery,String processor,int camera){
		super(brand,ram,rom,battery,processor,camera);
		this.model = model;
		this.price = price;
		this.display = display;
		this.simType = simType;
	}

	public void displaySamsung(){
		System.out.println("***** Samsung Details *****");
		System.out.println("Model:"+this.model);
		System.out.println("Price:"+this.price);
		System.out.println("Display size:"+this.display);
		System.out.println("SIM Type:"+this.simType);
		System.out.println();
	}
}

class SmartPhoneDriver{
	public static void main(String[] args) {
		Samsung obj = new Samsung("SAMSUNG A53",40000,6.5,"Dual SIM","SAMSUNG",8,128,5000,"G80",32);
		obj.displaySmartPhone();
		obj.displaySamsung();
	}
}