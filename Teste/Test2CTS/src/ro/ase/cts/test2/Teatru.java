package ro.ase.cts.test2;

public class Teatru implements IShow {

	//mandatory generic fields
	private String name;
	private String location;
	private String date;
	private String startingHour;
	// mandatory specific fields
	private String regizor;
	
	public Teatru() {}
	
	public Teatru(String name, String location, String date, String startingHour)
	{
		this.name=name;
		this.location=location;
		this.date=date;
		this.startingHour = startingHour;
	}
	
	

	public void setStartingHour(String startingHour) {
		this.startingHour = startingHour;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getLocation() {
		return this.location;
	}

	@Override
	public String getDateTime() {
		return this.date;
	}

	@Override
	public void printDetails() {
		System.out.println("Teatru [name=" + name + ", location=" + location + ", date=" + date + ", startingHour=" + startingHour
				+ ", regizor=" + regizor + "]");
	}
	
	
	

}
