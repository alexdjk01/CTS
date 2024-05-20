public class XMLAdapter implements DataAdapter{
    private XMLDataReader XMLreader;

    public XMLAdapter(XMLDataReader xmlDataReader)
    {
        this.XMLreader = xmlDataReader;
    }

    @Override
    public String readData() {
        return XMLreader.readXML();
    }
}
