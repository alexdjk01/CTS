package homework;

//all the threads will get instances of different singleton class
public class MultiThreadingSingleton {
	
	//use volatile here because:
	// Thread A is in the process of getting the instance so the instance is no longer null (is like 70% done)-shared memory - partially constucted object
	// Thread B enters the if statement and sees that the instance is not null thus enters the statement and crushed the application  
	public static volatile MultiThreadingSingleton instance;
	private String information;
	private int number;
	
	//constructor
	private MultiThreadingSingleton(String informations, int number) {
		this.information=information;
		this.number = number;
	}
	
	//this method returns an instance of the Singleton class
	public static synchronized MultiThreadingSingleton getInstance(String information, int number) {
		//need this if statement because we don't need the threads to wait the synchronized.
		//this improves the performance of the code by limiting the synchronization.
		if (instance ==null) {
			//we need this check in case of two threads or more try to access this in the same time
			//thus not creating 2 instances  ( synchronized ) 
			// now the second thread will need to wait for it's turn and if the instance is already initialized 
			synchronized (MultiThreadingSingleton.class) {
				//we create a new instance of the class only if the instance is null or has not been initialized(static)
				if (instance == null) {
					instance = new MultiThreadingSingleton(information, number);
				}
			}
			
		}
		return instance;
		
	}
}
