package prototype.ase;

public class ConcretePrototypeA implements Prototype{
	
	public Prototype clone() { return new ConcretePrototypeA();}

}
