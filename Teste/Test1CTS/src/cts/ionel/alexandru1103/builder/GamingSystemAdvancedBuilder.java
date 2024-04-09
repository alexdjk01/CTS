package cts.ionel.alexandru1103.builder;

public class GamingSystemAdvancedBuilder implements IGamingSystemBuilder {

	private final IGamingSystem gamingSystem;
	
	public GamingSystemAdvancedBuilder() {
		this.gamingSystem = new GamingSystemAdvanced();
	}

	@Override
	public void buildPlacaDeBaza() {
		this.gamingSystem.setPlacaDeBaza("MSI");
	}

	@Override
	public void buildRam() {
		this.gamingSystem.setRam("16GB");
	}

	@Override
	public void buildSdd() {
		this.gamingSystem.setSdd("800GB");
	}

	@Override
	public void buildPlacaVideo() {
		this.gamingSystem.setPlacaVideo("Nvidia RTX 3060TI 8GBVRAM");
	}
	
	public void buildMouse() {
		((GamingSystemAdvanced)gamingSystem).setMouse("Logitech 320");
	}
	
	public void buildTastatura() {
		((GamingSystemAdvanced)gamingSystem).setTastature("Redragon 4000");
	}
	
	public void buildCameraWeb() {
		((GamingSystemAdvanced)gamingSystem).setCameraWeb("Miria 200");
	}
	
	public void buildCasti() {
		((GamingSystemAdvanced)gamingSystem).setCasti("GTX PRO");
	}

	@Override
	public IGamingSystem getGamingSystem() {
		return this.gamingSystem;
	}
	
	
}
