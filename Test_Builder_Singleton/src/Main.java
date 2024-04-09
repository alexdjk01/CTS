
public class Main {

	public static void main(String[] args) {
		
		IGamingSystemBuilder builder = new AsusGSBuilder();
		GamingSystemEngineer engineer = new GamingSystemEngineer(builder);
		engineer.buildSystem();
		IGamingSystem system = engineer.getSystem();
		system.printConfiguration();
		
		ITestingModule module = Module.getInstance("AAAAAAAAAAAAAA", "BBBBBBBBBBBBBBBBBBBB");
		System.out.println(module.test());
		
		ITestingModule module2 = Module.getInstance("CCCCCCCCCCCCCCC", "DDDDDDDDDDDDDDDDDDDD");
		System.out.println(module2.test());
		

	}

}
