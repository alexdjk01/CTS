
public class AsusGS implements IGamingSystem {
	
	private String placaBaza;
	private String ram;
	private String ssd;
	private String placaVideo;
	
	private String mouse;

	@Override
	public void setPlacaBaza(String placaBaza) {
		this.placaBaza=placaBaza;
		
	}

	@Override
	public void setRam(String ram) {
		this.ram=ram;
		
	}

	@Override
	public void setSsd(String ssd) {
		this.ssd=ssd;
		
	}

	@Override
	public void setPlacaVideo(String placaVideo) {
		this.placaVideo=placaVideo;
		
	}
	
	public void setMouse(String mouse) {
		this.mouse=mouse;
		
	}

	@Override
	public void printConfiguration() {
		System.out.println("AsusGS [placaBaza=" + placaBaza + ", ram=" + ram + ", ssd=" + ssd + ", placaVideo=" + placaVideo
				+ ", mouse=" + mouse + "]");
	}

	
	

}
