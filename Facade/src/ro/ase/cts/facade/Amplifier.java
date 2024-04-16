package ro.ase.cts.facade;

public class Amplifier {

	public void on() {
		System.out.println("AMP ON!");		
	}

	public void setDvd(DvdPlayer dvd) {
		System.out.println("DVD set for amplifier: " +dvd.toString());
		
	}

	public void setSurroundSound() {
		System.out.println("Enable surround sound");
		
	}

	public void setVolume(int i) {
		System.out.println("Volume is :" + i);
		
	}

	public void off() {
		System.out.println("AMP OFF!");
		
	}

}
