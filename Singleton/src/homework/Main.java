package homework;

public class Main {

	public static void main(String[] args) {
		NormalSingleton singleton = NormalSingleton.getInstance("sss");
		System.out.println(singleton);
	}

}
