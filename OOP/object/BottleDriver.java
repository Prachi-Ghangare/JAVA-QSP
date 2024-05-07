class Bottle{
	String material;
	double cap;
	double weight;

	{
		System.out.println("Hi I am a Non-Static block");
	}
	void display(){
		System.out.println(material+ " " + cap + " " +weight);
	}
}

class BottleDriver{
	public static void main(String[] args) {
		Bottle obj1 = new Bottle();
		obj1.display();

		Bottle obj2 = new Bottle();
		obj2.display();

		Bottle obj3 = new Bottle();
		obj3.display();		
	}
}