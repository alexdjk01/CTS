package ro.ase.cts.homework.prototype;

public class SalesReport implements Report{

	private String format;
	private String data;
	
	//de ce sa nu fie aici direct construcotru cu parametrii??? in diagaram e fara parametrii
	// altfel metoda clone o sa genereze tot timpu un obiect default!
	// asta daca nu folosesc setteri din nou in clone.
	public SalesReport() {}

	@Override
	public void generateReport() {
		System.out.println("Report : data - " +this.data +" | format - " + this.format);
	}

	@Override
	public void setData(String data) {
		this.data=data;
	}

	@Override
	public void setFormat(String format) {
		this.format=format;
	}
	
	public Report clone() {
		Report sales =  new SalesReport();
		sales.setData(this.data);
		sales.setFormat(this.format);
		return sales;
	}
	
	
	
}
