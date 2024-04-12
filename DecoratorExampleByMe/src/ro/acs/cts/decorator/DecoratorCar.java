package ro.acs.cts.decorator;


//the decorator class implements the interface and also defines a composition(HAS-A) relationship with the interface
public class DecoratorCar implements Car {

	public Car car;
	
	// constructor
	public DecoratorCar(Car car)
	{
		this.car=car;
	}
	
	@Override
	public void create() {
		this.car.create();
		
	}

}
