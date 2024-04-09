
public class ConcertFactory implements IShowFactory {

	@Override
	public IShow createShow(String name, String location, String date) {
		IShow concert = new  Concert(name,location,date);
		((Concert)concert).setArtists(null);
		((Concert)concert).setGenre("Drama");
		return concert;
	}

}
