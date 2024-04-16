package ro.ase.cts.facade;

public class DvdPlayer {

	public void on() {
		System.out.println("DVD ON!");
		
	}

	public void play(String movie) {
		System.out.println("Play movie:!" + movie);
		
	}

	public void stop() {
		System.out.println("DVD STOPED!");
		
	}

	public void eject() {
		System.out.println("DVD EJECTED!");
		
	}

	public void off() {
		System.out.println("DVD OFF!");
		
	}

}
