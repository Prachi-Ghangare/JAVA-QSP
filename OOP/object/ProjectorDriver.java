class Projector{
	String brand;
	double lens;
	int noiseLevel;
	String type;
	int height;
	int width;
	double weight;
	double price;

	public void display(){
		System.out.println("***** Projector Specifications *****");
		System.out.println("Brand name : "+brand);
		System.out.println("Type : "+type);
		System.out.println("Height : "+height+"mm");
		System.out.println("Width : "+width+"mm");
		System.out.println("Weight : "+weight+"kg");
		System.out.println("Price :Rs."+price);
		System.out.println("Noise Level : "+noiseLevel+"dB");
		System.out.println("Lens focal length : "+lens+"mm");
	}
}

class ProjectorDriver{
	public static void main(String[] args) {
		Projector obj = new Projector();
		obj.brand ="EPSON";
		obj.type = "LCD";
		obj.height = 82;
		obj.width = 302;
		obj.weight = 2.4;
		obj.lens = 6.4;
		obj.noiseLevel = 37;
		obj.price = 33000;
		obj.display();
	}
}