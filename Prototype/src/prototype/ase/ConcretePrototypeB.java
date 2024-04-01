package prototype.ase;

public class ConcretePrototypeB implements Prototype{

	public Prototype clone() { return new ConcretePrototypeB(); }
}
