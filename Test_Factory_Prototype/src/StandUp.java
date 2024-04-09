import java.util.List;

public class StandUp implements IShow{

	private String name;
	private String location;
	private String date;
	

	private String language;
	private List<String> standUpers;
	
	public StandUp(String name, String location, String date)
	{
		this.name=name;
		this.location=location;
		this.date=date;
	}

	
	
	public String getLanguage() {
		return language;
	}



	public void setLanguage(String language) {
		this.language = language;
	}



	public List<String> getStandUpers() {
		return standUpers;
	}



	public void setStandUpers(List<String> standUpers) {
		this.standUpers = standUpers;
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
		System.out.println("Teatru [name=" + name + ", location=" + location + ", date=" + date + ", regizor=" + language
				+ ", actors=" + standUpers + "]");
		
	}
}
