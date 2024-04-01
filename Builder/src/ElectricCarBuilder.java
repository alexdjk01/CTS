
public class ElectricCarBuilder implements CarBuilder{

	private Car car;
	
	ElectricCarBuilder(){ this.car = new  ElectricCar();}

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
	
	public void buildCharger() {
		((ElectricCar) this.car).setCharger("MUIE MATA");
		
	}
	

	@Override
	public Car getCar() {
		return this.car;
	}

}
