package org.Enterprise.Base;


import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtilities {
    
	ResourceBundle bundle = ResourceBundle.getBundle("Config");
	public WebDriver driver;
	
	
	//@Parameters("browser")
	public void initiateBrowser(String browser_name) throws InterruptedException {
	//to read the data from property file
	
	
	if(browser_name.equalsIgnoreCase("Chrome"))
	{
	WebDriverManager.chromedriver().setup();
		
	driver=new ChromeDriver();
	}
	
	else if(browser_name.equalsIgnoreCase("Firefox"))
	{
		
	WebDriverManager.firefoxdriver().setup();
	
	driver=new FirefoxDriver();
		
	}
	//passing application URL from config file.
	driver.get(bundle.getString("Application_URl"));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Thread.sleep(4000);
	
	System.out.println("Before has executed");
	

	}
	
	
	public void closeBrowser() {
		driver.quit();
		System.out.println("After method has executed");
       
	}
	public void ExplicitwaitForElement(WebElement element, int timeInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public String  GetUrlOfPage(String url) {
		
      url=driver.getCurrentUrl();
      return url;
	}
	//WebDriverWait wait = new WebDriverWait(driver,5);
	//WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Test Link")));
	
	public WebElement ExplicitwaitForElementAndReturn(WebElement element, int timeInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	 	
	}
	 public void ImplicitWait(int timeInSeconds) {
		driver.manage().timeouts().implicitlyWait(timeInSeconds,TimeUnit.SECONDS);

	} 
	 
	public void SwitchDriverControl(String frameID ) {
		
		driver.switchTo().frame(frameID);
	}
	
	
	
	
	
	
}
     