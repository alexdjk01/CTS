
public class TeatruFactory implements IShowFactory{

	@Override
	public IShow createShow(String name, String location, String date) {
		IShow teatru = new  Teatru(name,location,date);
		((Teatru)teatru).setActors(null);
		((Teatru)teatru).setRegizor("Alex");
		return teatru;
	}

	
}
