package org.Enterprise.TestCase;

import java.util.ResourceBundle;

import org.Enterprise.Base.ActionsUtilities;
import org.Enterprise.Page.DeskBooking;
import org.Enterprise.Page.EnterpriseLogin;
import org.Enterprise.Page.Visitor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase_Visitors extends ActionsUtilities {

	 ResourceBundle objResourceBundle = ResourceBundle.getBundle("Config");
	 
	 EnterpriseLogin objEnterpriseLogin;
	 
	 Visitor objVisitor;
	 
	 ActionsUtilities objActionsUtilities;
	 
	 @BeforeMethod
		
		public void setup()
		{
			try {
				//String a=objResourceBundle.getString("Browser");
				initiateBrowser("Chrome");
				//initiateBrowser(objResourceBundle.getString("Browser"));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	
	 @Test(priority=4)
	 public void TestCaseVisitors() throws InterruptedException {
	 	try{
		 objEnterpriseLogin=PageFactory.initElements(driver, EnterpriseLogin.class);
		 objVisitor=PageFactory.initElements(driver,Visitor.class);
    	 ExplicitwaitForElement(objEnterpriseLogin.username, 120); 
    	 
    	sendKeys(objEnterpriseLogin.username,objResourceBundle.getString("user_name"));
 		sendKeys(objEnterpriseLogin.password,objResourceBundle.getString("user_password"));
 		click(objEnterpriseLogin.loginbtn);
 		
 		Thread.sleep(8000);
 		click(objEnterpriseLogin.goToapp);
	
	 
	  //***********Visitors Main tab******************** 
	 
	 
	   ImplicitWait(20);
		driver.switchTo().defaultContent();
		ImplicitWait(20);
		driver.switchTo().frame("leftNavigation");
		ImplicitWait(20);
		
		click(objVisitor.VisitorsTab);
		
		driver.switchTo().defaultContent();
		ImplicitWait(20);
		driver.switchTo().frame("mainDisplayFrame");
		
		
		WebElement Visitorsmaintab  =ExplicitwaitForElementAndReturn(objVisitor.VisitorsPage,120);
        
		
		if(Visitorsmaintab.isDisplayed()==true){
			System.out.println("Visitor main Tab is displayed");
		}
				
		else{
			System.out.println("Visitor main Tab is not displayed");
		}
	 
		 //***********Visitors Home tab********************
		
		driver.switchTo().defaultContent();
		ImplicitWait(20);
		driver.switchTo().frame("leftNavigation");
		ImplicitWait(20);
		
		click(objVisitor.HomeTab);
		
		driver.switchTo().defaultContent();
		ImplicitWait(20);
		driver.switchTo().frame("mainDisplayFrame");
		
		
		WebElement Home  =ExplicitwaitForElementAndReturn(objVisitor.HomePage,120);
        
		
		if(Home.isDisplayed()==true){
			System.out.println("Visitor Home Tab is displayed");
		}
				
		else{
			System.out.println("Visitor Home Tab is not displayed");
		}
		
		 //***********Find a Visitor********************
		
		driver.switchTo().defaultContent();
		ImplicitWait(20);
		driver.switchTo().frame("leftNavigation");
		ImplicitWait(20);
		
		click(objVisitor.FindAVisitorTab);
		
		driver.switchTo().defaultContent();
		ImplicitWait(20);
		driver.switchTo().frame("mainDisplayFrame");
		
		
		WebElement FindAvisitor  =ExplicitwaitForElementAndReturn(objVisitor.FindAVisitorPage,120);
        
		
		if(FindAvisitor.isDisplayed()==true){
			System.out.println("Find A Visitor page is displayed");
		}
				
		else{
			System.out.println("Find A Visitor page is not displayed");
		}
		 //**********Your Visitor********************
		driver.switchTo().defaultContent();
		ImplicitWait(20);
		driver.switchTo().frame("leftNavigation");
		ImplicitWait(20);
		
		click(objVisitor.YourVisitorTab);
		
		driver.switchTo().defaultContent();
		ImplicitWait(20);
		driver.switchTo().frame("mainDisplayFrame");
		
		
		WebElement Yourvis  =ExplicitwaitForElementAndReturn(objVisitor.YourVisitorPage,120);
        
		
		if(Yourvis.isDisplayed()==true){
			System.out.println("Your Visitor page is displayed");
		}
				
		else{
			System.out.println("Your Visitor page is not displayed");
		}
		 //**********Contacts********************
		driver.switchTo().defaultContent();
		ImplicitWait(20);
		driver.switchTo().frame("leftNavigation");
		ImplicitWait(20);
		
		click(objVisitor.ContactsTab);
		
		driver.switchTo().defaultContent();
		ImplicitWait(20);
		driver.switchTo().frame("mainDisplayFrame");
		
		
		WebElement contacts  =ExplicitwaitForElementAndReturn(objVisitor.ContactsPage,120);
        
		
		if(contacts.isDisplayed()==true){
			System.out.println("Contacts page is displayed");
		}
				
		else{
			System.out.println("Contacts page is not displayed");
		}
		
	 	}
	 	catch(Exception e )
	 	{
	 		driver.switchTo().defaultContent();
    		 ImplicitWait(20);
    		 click(objEnterpriseLogin.logout); 
    		 ImplicitWait(20);
    		 System.out.println("catch block executed");
    		 driver.close();
	 	}
		
	 	driver.switchTo().defaultContent();
		 ImplicitWait(20);
		 click(objEnterpriseLogin.logout); 
		 ImplicitWait(20);
		 System.out.println("Final Logout");            	
   	      driver.close();
		  
	 }
}
