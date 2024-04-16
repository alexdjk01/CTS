package ro.ase.cts.adapterHM3;

public class thirdPartyLogLibraryAdapter implements Logging{

	private thirdPartyLogLibrary library;
	
	
	
	public thirdPartyLogLibraryAdapter(thirdPartyLogLibrary library) {
		this.library = library;
	}



	@Override
	public void logSomething() {
		library.logMessage();
		
	}

}
