package ro.ase.cts.adapter;

public class XMLAdapter implements DataReader{
	
	private XMLDataReader xmlReader;
	
	public XMLAdapter(XMLDataReader reader)
	
	{
		this.xmlReader=reader;
	}

	@Override
	public String readData() {
		return this.xmlReader.readXML();
	}
 

}
