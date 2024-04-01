
public class Main {

	public static void main(String[] args) {
		CarBuilder builder = new NormalCarBuilder();
		CarDirector director = new CarDirector(builder);
		director.buildCar();
		Car masina = director.getCar();
		System.out.println(masina.showDetails());
		
		CarBuilder builder2 = new ElectricCarBuilder();
		CarDirector director2 = new CarDirector(builder2);
		director2.buildCar();
		Car masina2 = director2.getCar();
		System.out.println(masina2.showDetails());
	}

}
