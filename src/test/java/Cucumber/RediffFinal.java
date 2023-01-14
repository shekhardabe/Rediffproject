package Cucumber;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.SeleniumOperation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RediffFinal 
{
	
	@Given("user open browser with {string} and {string}")
	public void user_open_browser_with_and(String string, String string2)
	{
		   Object [] input1=new Object[2];
		   input1[0]="webdriver.chrome.driver";
		   input1[1]="C:\\Automation support\\chromedriver.exe";
		  Hashtable<String,Object>output1=  SeleniumOperation.browserlaunch(input1);
	}

	@Given("user enter url as {string}")
	public void user_enter_url_as(String string)
	{
		   Object [] input2= new Object[2];
		   input2[0]="https://mail.rediff.com/cgi-bin/login.cgi";
		   SeleniumOperation.openApplication(input2);  
	}

	@When("User click on login button")
	public void user_click_on_login_button() 
	{
		
		 Object [] input3= new Object[2];
         input3[0]="//*[@type='submit']";
         SeleniumOperation.clickOnElement(input3);
      
	}

	@When("User click on Ok button")
	public void user_click_on_ok_button() 
	{
		  Object [] input4= new Object[2];
          SeleniumOperation.Alertclass(input4);
	}

	@When("User RightClick on Page")
	public void user_right_click_on_page()
	{
		 Object [] input5= new Object[2];
         input5[0]="//*[@class=\"lft_advt_container\"]";
         SeleniumOperation.moveToElement(input5);
         
	}

	@When("User find Title of page")
	public void user_find_title_of_page() 
	{
		 Object [] input6= new Object[2];
         SeleniumOperation.Title(input6);
         
	}

	@When("User find Tagname of page")
	public void user_find_tagname_of_page()
	{
		 Object [] input7= new Object[2];
         SeleniumOperation.Tagname(input7);
         
	}

	@When("User find No of frame on page")
	public void user_find_no_of_frame_on_page()
	{
		 Object [] input8= new Object[2];
         SeleniumOperation.Frame(input8);
	   
	}

	@When("user get current url of page")
	public void user_get_current_url_of_page() 
	{
		 Object [] input9= new Object[2];
         SeleniumOperation.Url(input9);
	}



}
