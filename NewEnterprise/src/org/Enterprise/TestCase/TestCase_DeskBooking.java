package org.Enterprise.TestCase;

import java.util.ResourceBundle;

import org.Enterprise.Base.ActionsUtilities;
import org.Enterprise.Page.DeskBooking;
import org.Enterprise.Page.EnterpriseLogin;
import org.Enterprise.Page.RoomBooking;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 public class TestCase_DeskBooking extends ActionsUtilities  {

 ResourceBundle objResourceBundle = ResourceBundle.getBundle("Config");
 
 EnterpriseLogin objEnterpriseLogin;
 
 DeskBooking objDeskBooking;
 
 ActionsUtilities objActionsUtilities;
 
 @BeforeMethod
	
	public void setup()
	{
		try {
			//String a=objResourceBundle.getString("Browser");
			initiateBrowser("Chrome");
			//initiateBrowser(objResourceBundle.getString("Browser"));
		    } catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
 	  
     @Test(priority=2)
      public void TestCaseDeskBooking() throws InterruptedException {
	   try{
    	 objEnterpriseLogin=PageFactory.initElements(driver, EnterpriseLogin.class);
    	 objDeskBooking=PageFactory.initElements(driver,DeskBooking.class);
    	 ExplicitwaitForElement(objEnterpriseLogin.username, 120);
    		sendKeys(objEnterpriseLogin.username,objResourceBundle.getString("user_name"));
    		sendKeys(objEnterpriseLogin.password,objResourceBundle.getString("user_password"));
    		click(objEnterpriseLogin.loginbtn);
    		
    		Thread.sleep(8000);
    		click(objEnterpriseLogin.goToapp);
    	    
    		//***********Desk Booking Main tab******************** 
    		ImplicitWait(20);
    		driver.switchTo().defaultContent();
    		ImplicitWait(20);
    		driver.switchTo().frame("leftNavigation");
    		ImplicitWait(20);
    		
    		click(objDeskBooking.DeskbookingsTab);
    		
    		driver.switchTo().defaultContent();
    		ImplicitWait(20);
    		driver.switchTo().frame("mainDisplayFrame");
    		
    		WebElement deskmaintab  =ExplicitwaitForElementAndReturn(objDeskBooking.Deskbookingpage,120);
          
    		
    		if(deskmaintab.isDisplayed()==true){
    			System.out.println("Desk Booking tab is displayed");
    		}
    				
    		else{
    			System.out.println("Desk Booking tab is not displayed");
    		}
    		
    		//***********Desk Booking Home Tab******************** 
    		
    		driver.switchTo().defaultContent();
    		ImplicitWait(20);
    		driver.switchTo().frame("leftNavigation");
    		ImplicitWait(20);
    		
    		click(objDeskBooking.HomeTab);
    		driver.switchTo().defaultContent();
    		ImplicitWait(20);
    		driver.switchTo().frame("mainDisplayFrame");
    		
    		WebElement Home  =ExplicitwaitForElementAndReturn(objDeskBooking.Homepage,120);
    		
    		if(Home.isDisplayed()==true)
    		{
    			System.out.println("Desk Booking Home page is displayed displayed");
    		}
    		
    		else{
    			
    			System.out.println("Desk Booking Home page is not displayed displayed");
    		
    		}
    		
    		//***********Desk Booking Your Booking******************** 
    		
    		driver.switchTo().defaultContent();
    		ImplicitWait(20);
    		driver.switchTo().frame("leftNavigation");
    		ImplicitWait(20);
    		
    		click(objDeskBooking.YourBookingsTab);
    		driver.switchTo().defaultContent();
    		ImplicitWait(20);
    		driver.switchTo().frame("mainDisplayFrame");
    		
            WebElement Yourbooking  =ExplicitwaitForElementAndReturn(objDeskBooking.YourBookingsPage,120);
    		
    		if(Yourbooking.isDisplayed()==true)
    		{
    			System.out.println("Desk your booking page is displayed displayed");
    		}
    		
    		else{
    			
    			System.out.println("Desk your booking page is not displayed displayed");
    		
    		}
    		
    		//***********Find A Desk******************** 
    		
    		driver.switchTo().defaultContent();
    		ImplicitWait(20);
    		driver.switchTo().frame("leftNavigation");
    		ImplicitWait(20);
    		
    		click(objDeskBooking.FindADeskTab);
    		driver.switchTo().defaultContent();
    		ImplicitWait(20);
    		driver.switchTo().frame("mainDisplayFrame");
    		
            WebElement findAdesk  =ExplicitwaitForElementAndReturn(objDeskBooking.FindADeskPage,120);
    		
    		if(findAdesk.isDisplayed()==true)
    		{
    			System.out.println("Find A Desk page is displayed displayed");
    		}
    		
    		else{
    			
    			System.out.println("Find A Desk page is not displayed displayed");
    		
    		}
    		
    		//*********** Desk Booking Grid******************** 
    		
    		driver.switchTo().defaultContent();
    		ImplicitWait(20);
    		driver.switchTo().frame("leftNavigation");
    		ImplicitWait(20);
    		
    		click(objDeskBooking.BookingGridTab);
    		driver.switchTo().defaultContent();
    		ImplicitWait(20);
    		driver.switchTo().frame("mainDisplayFrame");
    		
            WebElement bookinggrid  =ExplicitwaitForElementAndReturn(objDeskBooking.BookingGridPage,120);
    		
    		if(bookinggrid.isDisplayed()==true)
    		{
    			System.out.println("Desk booking grid is displayed displayed");
    		}
    		
    		else{
    			
    			System.out.println("Desk booking grid is not displayed displayed");
    		
    		}
    		//***********Find A Colleague******************** 
    		
    		driver.switchTo().defaultContent();
    		ImplicitWait(20);
    		driver.switchTo().frame("leftNavigation");
    		ImplicitWait(20);
    		
    		click(objDeskBooking.FindAColleagueTab);
    		driver.switchTo().defaultContent();
    		ImplicitWait(20);
    		driver.switchTo().frame("mainDisplayFrame");
    		
            WebElement findcolleague  =ExplicitwaitForElementAndReturn(objDeskBooking.FindAColleaguepage,120);
    		
    		if(findcolleague.isDisplayed()==true)
    		{
    			System.out.println("Find A Colleague page is displayed displayed");
    		}
    		
    		else{
    			
    			System.out.println("Find A Colleague page is not displayed displayed");
    		
    		    }
    		//***********Desk Users******************** 
    		driver.switchTo().defaultContent();
    		ImplicitWait(20);
    		driver.switchTo().frame("leftNavigation");
    		ImplicitWait(20);
    		
    		click(objDeskBooking.UsersTab);
    		driver.switchTo().defaultContent();
    		ImplicitWait(20);
    		driver.switchTo().frame("mainDisplayFrame");
    		
            WebElement users  =ExplicitwaitForElementAndReturn(objDeskBooking.Userspage,120);
    		
    		if(users.isDisplayed()==true)
    		{
    			System.out.println("User page is displayed displayed");
    		}
    		
    		else{
    			
    			System.out.println("User page is not displayed displayed");
    		
    		    }
	         }
	   
    	     catch(Exception e) 
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
