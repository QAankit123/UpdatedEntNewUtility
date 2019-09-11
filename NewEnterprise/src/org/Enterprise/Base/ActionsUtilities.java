package org.Enterprise.Base;

import java.util.ResourceBundle;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ActionsUtilities extends DriverUtilities {
	
	public ExtentHtmlReporter objreporter;
	public  ExtentReports objext;
	public ExtentTest objlogger;
	public SoftAssert objsoftassert;
	   ResourceBundle objResourceBundle;
	   //ResourceBundle.getBundle("Config"); 
	   public void sendKeys(WebElement element, String text) {
			try {
				element.sendKeys(text);
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		}
	
	public void click(WebElement element) {
		try {
			element.click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	public void wait(int timeInSeconds) {
		try {
			Thread.sleep(timeInSeconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
}
	
	      @BeforeSuite
	      public void GenerateReport() {
			
		   objreporter = new ExtentHtmlReporter("./NewReport/EnterpriseTEST.html");
			
		    objext = new ExtentReports();	
					
			objext.attachReporter(objreporter);
			
			

		}
	      @BeforeSuite
	      public void Verificatin() {
			
          objsoftassert= new SoftAssert();
          
		}
	
	
	
}
