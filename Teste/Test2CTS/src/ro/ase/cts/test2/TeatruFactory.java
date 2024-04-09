package ro.ase.cts.test2;

public class TeatruFactory implements IShowFactory{

	@Override
	public IShow createShow(String name, String location, String date, String startingHour) {
		// numai pentru teatru populez variabilele.
		IShow teatru= new Teatru(name,location,date,startingHour);
		((Teatru) teatru).setStartingHour(startingHour);
		return teatru;
	}

}
