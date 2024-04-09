package ro.ase.cts.test2;

import java.util.HashMap;
import java.util.Map;

public class Client {

	private Map<String, IPoster> shows = new HashMap<>();
	
	public Client() throws InterruptedException {
		shows.put("teatru", new TeatruPoster());
		shows.put("concert", new ConcertPoster());
		shows.put("standUp", new StandUpComedyPoster());
	}
	
	public IPoster create(String key)
	{
		return shows.get(key).clone();
	}
	
}
