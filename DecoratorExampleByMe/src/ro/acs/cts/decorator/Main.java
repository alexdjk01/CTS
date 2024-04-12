package ro.acs.cts.decorator;

public class Main {

	public static void main(String[] args) {
		
		Car carSport = new ConcreteDecoratorCarSport( new NormalCar());
		carSport.create();
		
		System.out.println("--------------------------------------");
		
		Car carSportLuxury = new ConcreteDecoratorCarSport(new ConcreteDecoratorCarLuxury ( new NormalCar()));
		carSportLuxury.create();

	}

}
