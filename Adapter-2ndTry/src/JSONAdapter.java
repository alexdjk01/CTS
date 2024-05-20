public class JSONAdapter implements DataAdapter{

    private JSONDataReader jsonDataReader;
    public JSONAdapter(JSONDataReader jsonDataReader)
    {
        this.jsonDataReader = jsonDataReader;
    }
    @Override
    public String readData() {
        return jsonDataReader.readJSON();
    }
}
