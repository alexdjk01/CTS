package ro.ase.cts.adapter;

public class JSONAdapter implements DataReader{
	
	private JSONDataReader jsonReader;
	
	public JSONAdapter(JSONDataReader reader)
	
	{
		this.jsonReader=reader;
	}

	@Override
	public String readData() {
		return this.jsonReader.readJSON();
	}
 

}