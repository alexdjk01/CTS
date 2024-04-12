package ro.acs.cts.decorator;

//This class implements the interface car and overrides the method.
public class NormalCar implements Car {

	@Override
	public void create() {
		System.out.println("Normal car created!");
		
	}

}
