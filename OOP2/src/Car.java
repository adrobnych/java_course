
public class Car {
	
	private String brand;
	private String model;
	private int maxSpeed;
	
	private static int numberOfCars; 
	
	public Car(String brand, String model, int maxSpeed) {
		this.brand = brand;
		this.model = model;
		this.maxSpeed = maxSpeed;
		numberOfCars++;
	}

	public String describeYourself(){
		StringBuffer info = new StringBuffer("");
		info.append("car #" + getNumberOfCars() + "\n");
		info.append(brand + "\n");
		info.append(model+ "\n");
		info.append("maxSpeed: " + maxSpeed);
		return info.toString();
	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}

}
