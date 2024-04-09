package ro.ase.cts.test2;

public class Main {

	public static void main(String[] args) throws InterruptedException {
			IShowFactory firstShow = new TeatruFactory();
			Teatru teatru = (Teatru) firstShow.createShow("Gogo", "Amzei","Azi" , "19:00");
			teatru.printDetails();
			
			IShowFactory secondShow = new ConcertFactory();
			Concert concert = (Concert) secondShow.createShow("Zozo", "Romana","Maine" , "22:00");
			concert.printDetails();
			
			IShowFactory thirdShow = new StandUpComedyFactory();
			StandUpComedy standUp = (StandUpComedy) thirdShow.createShow("Xoxo", "Universitate","20.04.2024" , "22:00");
			standUp.printDetails();
			
			Client client = new Client();
			TeatruPoster posterTeatru = (TeatruPoster) client.create("teatru");
			posterTeatru.print(teatru);
			
			ConcertPoster posterConcert = (ConcertPoster) client.create("concert");
			posterConcert.print(concert);
			
			
	}

}
