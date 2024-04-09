
public class AsusGSBuilder implements IGamingSystemBuilder {

	private  IGamingSystem system;
	
	AsusGSBuilder()
	{
		this.system = new AsusGS();
	}

	@Override
	public void buildPlacaBaza() {
		this.system.setPlacaBaza("Asus");
		
	}

	@Override
	public void buildRam() {
		this.system.setRam("32GB");
		
	}

	@Override
	public void buildSsd() {
		this.system.setSsd("1TB");
		
	}

	@Override
	public void buildPlacaVideo() {
		this.system.setPlacaVideo("GTX 1060");
		
	}
	
	public void buildMouse()
	{
		((AsusGS)this.system).setMouse("Logitech 12");
	}

	@Override
	public IGamingSystem getSystem() {
		return this.system;
	}
	
	
	
}
