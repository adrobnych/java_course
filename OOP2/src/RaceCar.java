
public class RaceCar extends Car {

	String sponsor;
	
	public RaceCar(String brand, String model, int maxSpeed, String sponsor) {
		super(brand, model, maxSpeed);
		this.sponsor = sponsor;
	}
	
	public String describeYourself(){
		StringBuffer info = new StringBuffer(super.describeYourself());
		info.append("\n" + sponsor + "\n");
		return info.toString();
	}

}
