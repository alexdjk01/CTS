
public class GamingSystemEngineer {
	
	private IGamingSystemBuilder builder;
	
	GamingSystemEngineer(IGamingSystemBuilder builder)
	{
		this.builder = builder;
	}
	
	public void buildSystem()
	{
		builder.buildPlacaBaza();
		builder.buildRam();
		builder.buildSsd();
		builder.buildPlacaVideo();
		if( builder instanceof AsusGSBuilder)
			((AsusGSBuilder)builder).buildMouse();
	}
	
	public IGamingSystem getSystem()
	{
		return builder.getSystem();
	}

}
