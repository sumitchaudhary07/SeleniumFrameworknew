package resource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {

	ExtentReports er;
	public void reportGeneration()
	{
		
	String path=System.getProperty("user.dir")+ "\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Selenium Framewor result");
		reporter.config().setDocumentTitle("Test Result for regression");
		
		 er=new ExtentReports();
		er.attachReporter(reporter);
		
		
	}
	
}
