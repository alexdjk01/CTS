import java.util.List;

public class Teatru implements IShow {

	private String name;
	private String location;
	private String date;
	
	private String regizor;
	private List<String> actors;
	
	public Teatru(String name, String location, String date)
	{
		this.name=name;
		this.location=location;
		this.date=date;
	}
	
	
	
	public String getRegizor() {
		return regizor;
	}



	public void setRegizor(String regizor) {
		this.regizor = regizor;
	}



	public List<String> getActors() {
		return actors;
	}



	public void setActors(List<String> actors) {
		this.actors = actors;
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
		System.out.println("Teatru [name=" + name + ", location=" + location + ", date=" + date + ", regizor=" + regizor
				+ ", actors=" + actors + "]");
	}
	
	
}
