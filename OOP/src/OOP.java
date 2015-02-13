class Car implements TankFiller{
	String model;
	String brand;
	int numberOfSeats;
	double price;
	private static int numberOfCars = 0;
	public static int getNumberOfCars(){
		return numberOfCars;
	}
	
	Car(){
		model = "NA";
		brand = "NA";
		numberOfSeats = 4;
		price = 0;
		numberOfCars++;
	}
	
	Car(String model, String brand, double price){
		this.model = model;
		this.brand = brand;
		this.numberOfSeats = 4;
		this.price = price;
		numberOfCars++;
	}
	
	public void startEngine(){
		System.out.println("Engine started: " + brand + " " + model);
	}
	
	public void describeCar(){
		System.out.println(	"model: " + model + "\n" +
							"brand: " + brand + "\n" +
							"seats: " + numberOfSeats + "\n" +
							"price: " + price);
	}

	@Override
	public void fillTank() {
		System.out.println("Tank filled..." + brand + " " + model);
		
	}
}

class GasTransporter extends Car{
	
	int volume;
	
	GasTransporter(String model, String brand, double price, int volume){
		super(model,brand,price);
		this.volume = volume;
		this.numberOfSeats = 2;
	}
	
	public void describeCar(){
		super.describeCar();
		System.out.println("Volume: " + volume);
	}
	
}

class Bus extends Car{
	float ticket_price;
	
	Bus(){
		super();
		this.numberOfSeats = 100;
	}
	
	public void describeCar(){
		super.describeCar();
		System.out.println("This is a bus");
	}
}

interface TankFiller{
	public void fillTank();
}



public class OOP {


	public static void main(String[] args) {
		
		// basic work with Classes and Objects
		
		Car my_mashine = new Car("Fusion", "Ford", 2000.0);
		my_mashine.describeCar();
		my_mashine.startEngine();
		
		GasTransporter gt = new GasTransporter("hercules 322", "Ford", 34000, 1000);
		gt.describeCar();
		gt.startEngine();
		gt.fillTank();
		
		System.out.println("polymorphism:");
		Car x = new GasTransporter("mazda", "123", 12345555.99, 4000);
		x.describeCar();
		x = new Bus();
		x.describeCar();
		
		TankFiller y = new GasTransporter("mazda", "123", 12345555.99, 4000);
		y.fillTank();
		y = new Bus();
		y.fillTank();
		
		System.out.print("Total number of cars: " + Car.getNumberOfCars());
	}

}
