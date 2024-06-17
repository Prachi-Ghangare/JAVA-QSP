class Car{
	boolean key;
	public void startCar(boolean key) {
		this.key = key;
		if(key==true)
			System.out.println("Car Started");
		else
			System.out.println("Car Not Started");
	}
}

class CarDriver{
	static Car c;
	public static void main(String[] args) {
		System.out.println("main starts");
		try{
			CarDriver.c.key = true;  //NPE
			CarDriver.c.startCar(CarDriver.c.key);
		}
		catch(Exception e){
			e.printStackTrace();
			try{
				Car c = new Car();
				c.key = true;
				c.startCar(c.key);
			}
			catch(Exception i){
				e.printStackTrace();
			}
		}
		System.out.println("Main ends");
	}
}