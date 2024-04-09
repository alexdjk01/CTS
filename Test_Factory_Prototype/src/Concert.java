import java.util.List;

public class Concert implements IShow {

	private String name;
	private String location;
	private String date;
	

	private String genre;
	private List<String> artists;
	
	public Concert(String name, String location, String date)
	{
		this.name=name;
		this.location=location;
		this.date=date;
	}
	
	

	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public List<String> getArtists() {
		return artists;
	}



	public void setArtists(List<String> artists) {
		this.artists = artists;
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
		System.out.println("Teatru [name=" + name + ", location=" + location + ", date=" + date + ", regizor=" + genre
				+ ", actors=" + artists + "]");
		
	}
}
