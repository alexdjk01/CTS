package ro.ase.cts.test2;

public class StandUpComedyPoster implements IPoster{

private String imagineLogo;
	
	public StandUpComedyPoster() throws  InterruptedException
	{
		System.out.println("Generating Logo....");
		Thread.sleep(1000);
		System.out.println("Logo has been generated!");
		imagineLogo="StandUpLogo";
		
	}
	
	public StandUpComedyPoster(String imageLogo)
	{
		this.imagineLogo = imageLogo;
	}
	
	public IPoster clone() {
		return new StandUpComedyPoster(this.imagineLogo);
	}
	
	@Override
	public void print(IShow show) {
		System.out.println(this.imagineLogo + " " +show.getName() + " " + show.getLocation() + " " + show.getDateTime());
	}
	
}
