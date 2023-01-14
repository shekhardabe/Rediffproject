package Utility;

import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumOperation 
{
	
	public static ChromeDriver driver;
public static Hashtable<String,Object> outputParameters= new Hashtable<String,Object>();
	
	public static Hashtable<String,Object> browserlaunch(Object[] InputParameters)
	{	
		try
		{
			    String BrowserName = (String)InputParameters[0];
			    String strBrowserName=(String)InputParameters[0];
				String strExe=(String)InputParameters[1];
				System.setProperty(strBrowserName, strExe);
				driver = new ChromeDriver();	
				driver.manage().window().maximize();	
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:browserlaunch,Input Given: "+InputParameters[0].toString());
		}
		
	
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:browserlaunch,Input Given: "+InputParameters[0].toString());			
		}
		return outputParameters;
	}
	
	public static void openApplication(Object[]inputParameters)
	{
		String path=(String)inputParameters[0]; 
		driver.get(path); 
		
	
	}
	public static void clickOnElement(Object[]inputParameters)
	{
		String path=(String)inputParameters[0];
		driver.findElement(By.xpath(path)).click();
	
	
	}
	public static void moveToElement(Object[]inputParameters)
	{
		String xpath=(String)inputParameters[0];
		Actions act=new Actions(driver);											                        
		WebElement xyz=driver.findElement(By.xpath(xpath));                
		act.contextClick(xyz).build().perform();
	}
	public static void Alertclass(Object[]inputParameters) 
	{
		 driver.switchTo().alert();
	       Alert a=driver.switchTo().alert();
		   a.accept();   
	}
	public static void Title(Object[]inputParameters) 
	{
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	public static void Tagname(Object[]inputParameters) 
	{
		List<WebElement>number=driver.findElementsByTagName("a");
	    int total=number.size();
	    System.out.println(total);
	}
	public static void Frame(Object[]inputParameters) 
	{
		List<WebElement>num=driver.findElementsByTagName("iframe");
		int abc=num.size();
		System.out.println(abc);
		
	}
	public static void Url(Object[]inputParameters) 
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}
		
}