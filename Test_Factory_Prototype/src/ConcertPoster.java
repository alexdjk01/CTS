
public class ConcertPoster implements IPoster{

	private String imagineLogo;
	
	public ConcertPoster()
	{
		System.out.println("Image creating....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Image created!");
		System.out.println(imagineLogo);
		
	}
	
	public ConcertPoster(String imagine)
	{
		this.imagineLogo=imagine;
	}

	@Override
	public void print() {
		System.out.println(imagineLogo);
	}
	
	public IPoster clone() {
		return new ConcertPoster(this.imagineLogo);
	}
}
