
public class CarFactory {

	public static void main(String[] args) {
		
		Car firstCar = new Car("Ford", "fusion", 160);
		System.out.println(firstCar.describeYourself());
		
		Car secondCar = new RaceCar("Ferrary", "fg5858", 360, "Malboro");
		System.out.println(secondCar.describeYourself());
		
		Car car3 = new BatMobile("BatMobile", "1", 560);
		System.out.println(car3.describeYourself());
		((BatMobile)car3).startFlight();
		
		// polymorphism by interface
		AbilityToFlight[] superHeroes = new AbilityToFlight[2];
		superHeroes[0] = new BatMobile("Bmob", "bat22", 600);
		superHeroes[1] = new SantaVenchicle();
		
		for(AbilityToFlight x : superHeroes)
			x.startFlight();

	}


}
