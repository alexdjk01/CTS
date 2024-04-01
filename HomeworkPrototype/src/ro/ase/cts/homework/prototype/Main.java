package ro.ase.cts.homework.prototype;

public class Main {

	public static void main(String[] args) {
		
		ReportGenerator generator = new ReportGenerator();
		Report salesReportOne = generator.generateReport("sales", "21-04-2019", "dd-mm-yyyy");
		Report salesReportOneClone = generator.generateReport("sales", "12-12-2012", "dd-mm-yyyy");

		salesReportOne.generateReport();
		salesReportOneClone.generateReport();
		
		salesReportOneClone.setData("12-12-2012");
		salesReportOneClone.setFormat("mm-dd-yyyy");
		
		salesReportOneClone.generateReport();
	}

}
