public class XMLAdapter implements  DataReader{

    private XMLDataReader xmlDataReader;

    public XMLAdapter(XMLDataReader reader)
    {
        this.xmlDataReader = reader;
    }

    @Override
    public String readData() {
        return xmlDataReader.readXML();
    }
}
