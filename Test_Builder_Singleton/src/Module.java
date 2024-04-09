
public class Module implements ITestingModule {

	private static Module instance;
	private String compatibilityProblems;
	private String installationProblems;
	
	private Module(String comp, String instal)
	{
		this.compatibilityProblems=comp;
		this.installationProblems=instal;
	}
	
	public static Module getInstance(String comp, String instal)
	{
		if( instance ==null)
		{
			instance = new Module(comp,instal);
		}
		return instance;
	}

	@Override
	public String test() {
		return this.compatibilityProblems + " " + this.installationProblems;
	}
}
