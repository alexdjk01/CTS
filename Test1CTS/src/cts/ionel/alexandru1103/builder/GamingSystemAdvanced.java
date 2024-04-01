package cts.ionel.alexandru1103.builder;

public class GamingSystemAdvanced implements IGamingSystem{
	
	private String placaDeBaza;
	private String ram;
	private String sdd;
	private String placaVideo;
	
	private String mouse;
	private String tastatura;
	private String cameraWeb;
	private String casti;
	@Override
	public void setPlacaDeBaza(String placaDeBaza) {
		this.placaDeBaza = placaDeBaza;
	}
	@Override
	public void setRam(String ram) {
		this.ram=ram;
	}
	@Override
	public void setSdd(String sdd) {
		this.sdd = sdd;
	}
	@Override
	public void setPlacaVideo(String placaVideo) {
		this.placaVideo = placaVideo;
	}
	
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	
	public void setTastature(String tastatura) {
		this.tastatura = tastatura;
	}
	
	public void setCameraWeb(String cameraWeb) {
		this.cameraWeb = cameraWeb;
	}
	
	public void setCasti(String casti) {
		this.casti = casti;
	}
	
	
	@Override
	public void printConfiguration() {
		System.out.println("GamingSystemAdvanced [placaDeBaza=" + placaDeBaza + ", ram=" + ram + ", sdd=" + sdd + ", placaVideo="
				+ placaVideo + ", mouse=" + mouse + ", tastatura=" + tastatura + ", cameraWeb=" + cameraWeb + ", casti="
				+ casti + "]");
	}
	
	
	
	

}
