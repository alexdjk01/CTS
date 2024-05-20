public class LoggingDecorator implements DataService{

    private DataService dataService;

    public LoggingDecorator(DataService service)
    {
        this.dataService = service;
    }


    @Override
    public String fetchData() {
        return dataService.fetchData();
    }
}
