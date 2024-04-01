package homework;

public class NormalSingleton
{
	private static NormalSingleton instance;
	private String data;
	
	private NormalSingleton(String data)
	{
		this.data=data;
	}
	
	public static NormalSingleton getInstance(String data)
	{
		if( instance ==null)
		{
			instance = new NormalSingleton(data);
		}
		return instance;
	}
}