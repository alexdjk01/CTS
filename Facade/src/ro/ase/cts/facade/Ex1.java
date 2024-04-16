package ro.ase.cts.facade;

public class Ex1 {

	
	public static void main(String[] args)
	{
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Amplifier(), new Tuner(), new DvdPlayer(), new Projector(), new TheaterLights());
		homeTheater.watchMovie("Raiders of bla bla");
		homeTheater.endMovie();
	}
	
}
