package ro.ase.cts.facade;

public class HomeTheaterFacade {
	
	private Amplifier amp;
	private Tuner tuner;
	private DvdPlayer dvd;
	private Projector projector;
	private TheaterLights lights;
	
	HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, Projector projector, TheaterLights lights)
	{
		this.amp=amp;
		this.tuner = tuner;
		this.dvd=dvd;
		this.projector=projector;
		this.lights=lights;
	}
	
	void watchMovie(String movie)
	{
		System.out.println("Get ready to watch movie");
		lights.dim(10);
		projector.on();
		projector.setInput(dvd);
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}
	
	void endMovie()
	{
		System.out.println("Shutting down movie theatre");
		lights.on();
		amp.off();
		projector.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
	

}
