package ro.ase.cts.test2;

import java.util.List;

public class StandUpComedy implements IShow{

	//mandatory generic fields
		private String name;
		private String location;
		private String date;
		private String startingHour;
		// mandatory specific fields
		private String language;
		private List<String> comedyActors;
		
		public StandUpComedy() {}
		
		public StandUpComedy(String name, String location, String date, String startingHour)
		{
			this.name=name;
			this.location=location;
			this.date = date;
			this.startingHour = startingHour;
		}
		
		
		
		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public List<String> getComedyActors() {
			return comedyActors;
		}

		public void setComedyActors(List<String> comedyActors) {
			this.comedyActors = comedyActors;
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
			System.out.println("StandUpComedy [name=" + name + ", location=" + location + ", date=" + date + ", startingHour="
					+ startingHour + ", language=" + language + ", comedyActors=" + comedyActors + "]");
			
		}
		
}
