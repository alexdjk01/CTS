
public class Main {

	public static void main(String[] args) {
		IShowFactory firstShow = new TeatruFactory();
		Teatru teatru = (Teatru) firstShow.createShow("Teatru1", "Berceni", "Azi 21:00");
		teatru.printDetails();
		
		Client client = new Client();
		TeatruPoster posterTeatru = (TeatruPoster) client.create("teatru");
		posterTeatru.print();
		

	}

}
