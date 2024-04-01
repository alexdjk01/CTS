package ro.ase.cts.homework.prototype;

public interface Report {

	public void generateReport();
	public void setData(String data);
	public void setFormat(String format);
	
	Report clone();
	
}
