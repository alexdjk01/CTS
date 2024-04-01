package cts.ionel.alexandru1103.builder;

public interface IGamingSystem {

	//setters for principal components of the system
	public void setPlacaDeBaza(String placaDeBaza);
	public void setRam(String ram);
	public void setSdd(String sdd);
	public void setPlacaVideo(String placaVideo);
	
	//display configuration of the system
	public void printConfiguration();
}

