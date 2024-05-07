class Lift{
	int max;
	int min;
	double weight;
	String type;
	String shape;
	int power;
	int noButton;
	String emergency;

	public void display(){
		System.out.println("**** Lift Details ****");
		System.out.println("Lift Type :"+type);
		System.out.println("Max capacity of people :"+max);
		System.out.println("Min capacity of people :"+min);
		System.out.println("Capacity :"+weight+"kg");
		System.out.println("Shape :"+shape);
		System.out.println("Power Consumption :"+power+"kwh");
		System.out.println("No of Buttons :"+noButton);
		System.out.println("Emergency exit? :"+emergency);
	}
}

class LiftDriver{
	public static void main(String[] args) {
		Lift obj = new Lift();
		obj.type = "Standard";
		obj.max = 15;
		obj.min = 10;
		obj.weight = 850;
		obj.shape = "Rectangle";
		obj.power = 481;
		obj.noButton = 8;
		obj.emergency = "Yes";
		obj.display();
	}
}