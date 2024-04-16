package ro.ase.cts.adapterHM3;



public class Ex3 {

	public static void main(String[] args)
	{
		Logging library = new thirdPartyLogLibraryAdapter(new thirdPartyLogLibrary());
		library.logSomething();
	}
}
