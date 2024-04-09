package cts.ionel.alexandru1103.singleton;

public class TestingModule implements ITestingModule{
	
	private static TestingModule instance;
	private String copatibilityProblems;
	private String instalationProblems;
	
	private TestingModule(String copatibilityProblems, String instalationProblems)
	{
		this.copatibilityProblems = copatibilityProblems;
		this.instalationProblems = instalationProblems;
	}
	
	public static TestingModule getInstance(String copatibilityProblems, String instalationProblems)
	{
		if(instance == null)
			instance = new TestingModule(copatibilityProblems,instalationProblems);
		return instance;
	}

	@Override
	public String test() {
		String resultOfTesting = "Compatibility problems: "+this.copatibilityProblems +" | Installation problems: "+ this.instalationProblems;
		return resultOfTesting;
	}

}
