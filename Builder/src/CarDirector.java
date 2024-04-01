
public class CarDirector {
	
	private CarBuilder builder;
	
	CarDirector(CarBuilder builder){
		this.builder = builder;
	}

	public void buildCar() {
		builder.buildBrand();
		builder.buildEngine();
		builder.buildWheels();
		if(builder instanceof NormalCarBuilder)
		{
			((NormalCarBuilder) builder).buildAditives();
		}
		else if(builder instanceof ElectricCarBuilder)
		{
			((ElectricCarBuilder) builder).buildCharger();
		}
			
	}
	
	public Car getCar() { return builder.getCar();}
}
