package ro.ase.cts.test2;

import java.util.List;

public class Concert implements IShow{

	//mandatory generic fields
		private String name;
		private String location;
		private String date;
		private String startingHour;
		// mandatory specific fields
		private String genre;
		private List<String> actors;
		
		public Concert() {}
		
		public Concert(String name, String location, String date, String startingHour)
		{
			this.name=name;
			this.location=location;
			this.date = date;
			this.startingHour = startingHour;
		
		}
		

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
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
			System.out.println("Concert [name=" + name + ", location=" + location + ", date=" + date + ", startingHour="
					+ startingHour + ", genre=" + genre + ", actors=" + actors + "]");
		}

		
}
