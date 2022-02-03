package com.lunching;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager extends BaseTest0
{
	public static ExtentHtmlReporter htmlReport; //class reference for extenthtml report
	
	public static ExtentReports report;
	
	public static ExtentReports getInstance()
	{
		if(htmlReport == null)
		{
			htmlReport = new ExtentHtmlReporter(projectpath+"\\htmlreports\\report.html");
			htmlReport.config().setDocumentTitle("Automation Report");
			htmlReport.config().setReportName("Functional Report");
			htmlReport.config().setTheme(Theme.STANDARD); 
			
			report= new ExtentReports();
			report.attachReporter(htmlReport);
			report.setSystemInfo("OS", "Windows7");
			report.setSystemInfo("Tester Name", "Subhasmita");
			report.setSystemInfo("Browser", p.getProperty("chromebrowser"));
			 
		}
		
	
	return report;
}
}