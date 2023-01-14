package Cucumber;

import java.net.UnknownHostException;

import Utility.HTMLReportGenerator;
import io.cucumber.java.Scenario;

public class Hookable
{
	
	public void before(Scenario scenario) throws UnknownHostException 
	{
		HTMLReportGenerator.TestSuiteStart("C:\\Shekhar\\Rediff.html", "Rediff");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		System.out.println("-------------------Sceanrio start-----------------------");
		
	}

	public void after(Scenario scenario) 
	{
		System.out.println("-------------------Sceanrio end-----------------------");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
	}

	
	
	
	
	
}
