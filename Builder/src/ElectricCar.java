
public class ElectricCar implements Car {


	private String brand;
	private String engine;
	private String wheels;
	private String charger;
	
	@Override
	public void setBrand(String brand) {
		this.brand=brand;
		
	}
	@Override
	public void setEngine(String engine) {
		this.engine=engine;
		
	}
	@Override
	public void setWheels(String wheels) {
		this.wheels = wheels;
		
	}
	
	public void setCharger(String charger) {
		this.charger = charger;
		
	}
	@Override
	public String showDetails() {
		return "brand" + this.brand +" engine" + this.engine + " wheels" + this.wheels + " charger "+ this.charger;
	}
}
