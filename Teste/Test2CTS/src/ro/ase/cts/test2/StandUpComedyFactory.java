package ro.ase.cts.test2;

public class StandUpComedyFactory implements IShowFactory {

	@Override
	public IShow createShow(String name, String location, String date, String startingHour) {
		IShow standUp = new StandUpComedy(name,location,date,startingHour);
		((StandUpComedy) standUp).setComedyActors(null);
		((StandUpComedy) standUp).setLanguage("Under18YO");
		return standUp;
	}

}
