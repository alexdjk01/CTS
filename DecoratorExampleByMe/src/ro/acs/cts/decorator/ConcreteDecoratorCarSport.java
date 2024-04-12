package ro.acs.cts.decorator;

//Extends (inheritance) the normal decorator functionality
public class ConcreteDecoratorCarSport extends DecoratorCar {

	public ConcreteDecoratorCarSport(Car car)
	{
		super(car);
	}

	@Override
	public void create() {
		super.create();
		System.out.println("Editing -  adding new features to Concrete Sport Car");
	}
	
	
}
