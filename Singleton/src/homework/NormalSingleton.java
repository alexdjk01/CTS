package homework;

public class NormalSingleton {
    private static NormalSingleton instance;
    private String data;

    private NormalSingleton(String data) {
        this.data = data;
    }

    public static NormalSingleton getInstance(String data){
    	//this allows us to create only ONE instance but is not thread safe. Works only without threads!
        if ( instance == null ) {
            instance = new NormalSingleton(data);
        }
        return instance;
    }
}