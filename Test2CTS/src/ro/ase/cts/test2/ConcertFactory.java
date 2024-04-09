package ro.ase.cts.test2;

public class ConcertFactory implements IShowFactory{

	@Override
	public IShow createShow(String name, String location, String date, String startingHour) {
		IShow concert = new Concert(name,location,date,startingHour);
		((Concert) concert).setActors(null);
		((Concert) concert).setGenre("Drama");
		return concert;
	}

}
