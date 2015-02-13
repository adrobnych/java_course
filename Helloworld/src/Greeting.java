import java.util.Scanner;


class Greeting {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		Greeting greet = new Greeting();
		System.out.println("Hello " + greet.askName());
		
		greet.explainWork();
		
		int height = 0;
		
		while(height == 0){

			try{
				height = greet.getHeight();
			}
			catch(Exception e){
				System.out.println("SORRY BUT YOU HAVE TO ENTER DIGIT !" );
			}
		}
		
		int weight = 0;
		
		while(weight == 0){

			try{
				weight = greet.getWeight();
			}
			catch(Exception e){
				System.out.println("SORRY BUT YOU HAVE TO ENTER DIGIT !" );
			}
		}
		System.out.println("weight debug: " + weight);
		
		if(weight == (height - 100))
			System.out.println("You have ideal shape");
		else
			if(weight > (height - 100))
				System.out.println("We recommend drop off " + (- height + 100 + weight) + " kilograms");
			else
				System.out.println("We recommend add " + (height - 100 - weight) + " kilograms");
		
		scan.close();

	}
	
	
	private int getWeight() {
		System.out.println("What's your weight?");
		int weight = 0;
			
		weight = new Integer(scan.nextLine());
		scan.reset();

		return weight;
	}


	private int getHeight() {
		System.out.println("What's your height?");
		int height = 0;
			
		height = new Integer(scan.nextLine());
		scan.reset();

		return height;
	}


	private void explainWork() {
		System.out.println("We will estimate your weight and heigth and recomment some diet");
	}


	private String askName(){
		System.out.println("Hello User, what's your name?");
		String name = scan.nextLine();		
		scan.reset();
		return name;
	}

}




