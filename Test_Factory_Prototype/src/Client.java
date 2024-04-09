import java.util.HashMap;
import java.util.Map;

public class Client {

	private Map<String,IPoster> shows = new HashMap<>();
	
	public Client()
	{
		shows.put("teatru", new TeatruPoster());
		shows.put("concert", new ConcertPoster());
		shows.put("standUp", new StandUpPoster());
	}
	
	public IPoster create(String key)
	{
		return shows.get(key).clone();
	}
	
}
