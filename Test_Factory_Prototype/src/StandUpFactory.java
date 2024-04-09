
public class StandUpFactory implements IShowFactory {

	@Override
	public IShow createShow(String name, String location, String date) {
		IShow standUp = new  StandUp(name,location,date);
		((StandUp)standUp).setLanguage("Licentios");
		((StandUp)standUp).setStandUpers(null);
		return standUp;
	}

}
