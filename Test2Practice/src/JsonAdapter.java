public class JsonAdapter implements OnlineContract{

    private JsonInterpreter jsonInterpreter;

    public JsonAdapter(JsonInterpreter interpreter)
    {
        this.jsonInterpreter = interpreter;
    }

    @Override
    public String retrieveContractDetails() {
        return jsonInterpreter.processJson();
    }
}
