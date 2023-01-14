package Trial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tempt
{
	public static void main(String[] args)
	{
		//Browser launch
		System.setProperty("webdriver.chrome.driver", "C:\\Automation support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	     // openApplication
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
	
        //user click on sign button
       
        WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@type='submit']"))));
		driver.findElement(By.xpath("//*[@type='submit']")).click();
     

       // handle alert or pop up message
       driver.switchTo().alert();
       Alert a=driver.switchTo().alert();
	   a.accept();
	   
		//right click 
		Actions act=new Actions(driver);
		WebElement w=driver.findElement(By.xpath("//*[@class=\"lft_advt_container\"]"));
		act.contextClick(w).build().perform();
		
		
		//web page Title
		String title=driver.getTitle();
		System.out.println(title);
		
		//Find Tagname
		List<WebElement>number=driver.findElementsByTagName("c");
		int total=number.size();
		System.out.println(total);
		
		//Find no of frame on page
		List<WebElement>num=driver.findElementsByTagName("iframe");
		int abc=number.size();
		System.out.println(abc);
		
		//Find current url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
		}
}
