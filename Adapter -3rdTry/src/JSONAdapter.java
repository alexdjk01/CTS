public class JSONAdapter implements  DataReader{

    private JSONDataReader jsonDataReader;
    public JSONAdapter(JSONDataReader reader)
    {
        this.jsonDataReader = reader;
    }


    @Override
    public String readData() {
        return jsonDataReader.readJSON();
    }
}
