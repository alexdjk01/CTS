public class DocxAdapter implements OnlineContract{

    private DocxInterpreter docxInterpreter;

    public DocxAdapter(DocxInterpreter interpreter)
    {
        this.docxInterpreter = interpreter;
    }

    @Override
    public String retrieveContractDetails() {
        return docxInterpreter.processDocx();
    }
}
