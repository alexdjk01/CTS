
public class NormalCar implements Car{
	
	private String brand;
	private String engine;
	private String wheels;
	private String aditives;
	
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
	
	public void setAditives(String aditives) {
		this.aditives = aditives;
		
	}
	
	
	@Override
	public String showDetails() {
		return "brand" + this.brand +" engine" + this.engine + " wheels" + this.wheels + " aditives"+ aditives;
	}

}
