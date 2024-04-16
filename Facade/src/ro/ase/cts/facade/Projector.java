package ro.ase.cts.facade;

public class Projector {

	public void on() {
		System.out.println("Projector ON!");
		
	}

	public void setInput(DvdPlayer dvd) {
		System.out.println("Set up the projector using DVD: " +dvd.toString());
		
	}

	public void off() {
		System.out.println("Projecotr Off!");
		
	}

}
