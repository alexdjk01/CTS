package cts.ionel.alexandru1103.builder;

public class GamingSystemEngineer {

	private IGamingSystemBuilder builder;
	
	public GamingSystemEngineer(IGamingSystemBuilder builder) {
		this.builder = builder;
	}
	
	public void buildGamingSystemSetup() {
		builder.buildPlacaDeBaza();
		builder.buildRam();
		builder.buildSdd();
		builder.buildPlacaVideo();
		if( builder instanceof GamingSystemAdvancedBuilder)
		{
			((GamingSystemAdvancedBuilder) builder).buildMouse();
			((GamingSystemAdvancedBuilder) builder).buildTastatura();
			((GamingSystemAdvancedBuilder) builder).buildCameraWeb();
			((GamingSystemAdvancedBuilder) builder).buildCasti();
		}
	}
	
	public IGamingSystem getSystem() {
		return builder.getGamingSystem();
	}
	
}
