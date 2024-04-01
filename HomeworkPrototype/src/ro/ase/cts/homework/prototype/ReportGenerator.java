package ro.ase.cts.homework.prototype;

import java.util.HashMap;
import java.util.Map;

public class ReportGenerator {
	
	private Map<String,Report> reportsMap = new HashMap<>();
	
	public ReportGenerator()
	{
//		reportsMap.put("Sales", new SalesReport());
	}

	public Report generateReport(String key, String data, String format )
	{
		Report reportToGenerate = reportsMap.get(key);
		if(reportToGenerate == null)
		{
			System.out.println("Firslty we need to create the object then to return it!");
			reportToGenerate = new SalesReport();
			reportToGenerate.setData(data);
			reportToGenerate.setFormat(format);
			reportsMap.put(key, reportToGenerate);
		}
		return reportToGenerate.clone();
	}
}
