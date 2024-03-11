package homework;

//thread safe 
//holder is not allocated in memory even if the class is instantiated
//holder is instantiated only when getIntance is called
//it doesn't require synchronization
public class BillPughSingleton {
	//default constructor
  private BillPughSingleton() { }
  private static class SingletonHolder{
      private static final BillPughSingleton instance = new BillPughSingleton();
  }
  public static BillPughSingleton getInstance(){
      return SingletonHolder.instance;
  }
}