class WhiteBoard{
	String brand = "GURJAN";
	String dim = "15 x 4";
	double price = 10000;
	Marker m;
	Duster d;

	void displayBoard(){
		System.out.println("WhiteBoard : "+this.brand+", dimensions "+this.dim+" , price"+this.price+" rs.");
	}

	void addMarker(){
		m = new Marker();
	}
	void addDuster(){
		d = new Duster();
	}
}

class Marker{
	String brand = "Camlin";
	String color = "Red";
	double price = 40;

	void displayMarker(){
		System.out.println("Marker : "+this.brand+" ,color "+this.color+" ,price"+this.price);
	}
}

class Duster{
	String brand = "Polo";
	String material = "Plastic";
	double price = 150;

	void displayDuster(){
		System.out.println("Duster : "+this.brand+" ,material "+this.material+" ,price"+this.price);
	}
}
class AggregationEx{
	public static void main(String[] args) {
		WhiteBoard obj = new WhiteBoard();
		obj.displayBoard();
		obj.addMarker();
		obj.m.displayMarker();
		// obj.d.displayDuster();	//NPE
		obj.addDuster();
		obj.d.displayDuster();
	}
}