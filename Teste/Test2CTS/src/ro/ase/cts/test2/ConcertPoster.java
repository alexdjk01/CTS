package ro.ase.cts.test2;

public class ConcertPoster implements IPoster {

	private String imagineLogo;
	
	public ConcertPoster() throws  InterruptedException
	{
		System.out.println("Generating Logo....");
		Thread.sleep(1000);
		System.out.println("Logo has been generated!");
		imagineLogo="ConcertLogo";
		
	}
	
	public ConcertPoster(String imageLogo)
	{
		this.imagineLogo = imageLogo;
	}
	
	public IPoster clone() {
		return new ConcertPoster(this.imagineLogo);
	}
	
	@Override
	public void print(IShow show) {
		System.out.println(this.imagineLogo + " " +show.getName() + " " + show.getLocation() + " " + show.getDateTime());
	}
	
	
}
