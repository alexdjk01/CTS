package ro.acs.cts.decorator;

public class ConcreteDecoratorCarLuxury extends DecoratorCar{

	public ConcreteDecoratorCarLuxury(Car car)
	{
		super(car);
	}

	@Override
	public void create() {
		super.create();
		System.out.println("Editing -  adding new features to Concrete Luxury Car");
	}
	
	
}
