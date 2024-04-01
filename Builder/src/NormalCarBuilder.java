
public class NormalCarBuilder implements CarBuilder{
	
	private Car car;
	
	NormalCarBuilder(){ this.car = new  NormalCar();}

	@Override
	public void buildBrand() {
		this.car.setBrand("Audi");
		
	}

	@Override
	public void buildEngine() {
		this.car.setEngine("V6");
		
	}

	@Override
	public void buildWheels() {
		this.car.setWheels("21");
		
	}
	
	public void buildAditives() {
		((NormalCar) this.car).setAditives("21");
		
	}
	

	@Override
	public Car getCar() {
		return this.car;
	}

}
