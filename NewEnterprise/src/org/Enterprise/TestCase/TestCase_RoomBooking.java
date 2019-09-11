package org.Enterprise.TestCase;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.Enterprise.Base.ActionsUtilities;
import org.Enterprise.Base.DriverUtilities;
import org.Enterprise.Page.EnterpriseLogin;
import org.Enterprise.Page.RoomBooking;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

  

    public class TestCase_RoomBooking extends ActionsUtilities {
    //public WebDriver driver;	
    ResourceBundle objResourceBundle = ResourceBundle.getBundle("Config"); 
	EnterpriseLogin objEnterpriseLogin;
	RoomBooking     objRoomBooking;
	ActionsUtilities objActionsUtilities;
	//JavascriptExecutor js =(JavascriptExecutor)driver;
	
	//dcdsc
	 
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
	
	
	@Test(priority=3)
		
	
	public void TestCaseRoomBooking() throws InterruptedException {
		try{
	//Code for Enterprise login
	objEnterpriseLogin=PageFactory.initElements(driver, EnterpriseLogin.class);
	objRoomBooking=PageFactory.initElements(driver,RoomBooking.class);
	ExplicitwaitForElement(objEnterpriseLogin.username, 120);
	sendKeys(objEnterpriseLogin.username,objResourceBundle.getString("user_name"));
	sendKeys(objEnterpriseLogin.password,objResourceBundle.getString("user_password"));
	click(objEnterpriseLogin.loginbtn);
   Thread.sleep(8000);
	//ExplicitwaitForElement(objEnterpriseLogin.goToapp, 120);
   click(objEnterpriseLogin.goToapp);
    
    driver.switchTo().frame("mainDisplayFrame");
   //objActionsUtilities.SwitchDriverControl("mainDisplayFrame");
    

    WebElement element= ExplicitwaitForElementAndReturn(objRoomBooking.QuickRoomSearchPage,120);
	
        Boolean roomtab=element.isDisplayed();
        objsoftassert.assertTrue(roomtab);
	if(roomtab){
		System.out.println("Room Booking & Home tab is displayed");
         objlogger=objext.createTest("Room Booking & Home tab");
		
		objlogger.log(Status.PASS,"Room Booking & Home");
		
	}
	else{
		System.out.println("Room Booking & Home tab is not displayed");
      objlogger=objext.createTest("Room Booking & Home tab");
		
		objlogger.log(Status.FAIL,"Room Booking & Home");
	}
	
	
	//objext.flush();
	
	 
	
	//*********Your Booking***********
	driver.switchTo().defaultContent();
	ImplicitWait(20);
	driver.switchTo().frame("leftNavigation");
	ImplicitWait(20);
	System.out.println("switching done"); 
	
//	driver.switchTo().frame("leftNavigation");
//	Thread.sleep(8000);
	click(objRoomBooking.YourbookingsTab);
	driver.switchTo().defaultContent();
	ImplicitWait(20);
	driver.switchTo().frame("mainDisplayFrame");
	
	WebElement your_booking_page  =ExplicitwaitForElementAndReturn(objRoomBooking.yourbookingpage,120);
	
	Boolean yourbooking= your_booking_page.isDisplayed();
	
	objsoftassert.assertTrue(yourbooking);
	
	 
	
	if(yourbooking)
	{
		System.out.println("your booking is displayed");
		
		objlogger=objext.createTest("Your Booking tab");
		
		objlogger.log(Status.PASS,"Your Booking tab");	
		
		
	}
	
	else{
		
		System.out.println("your booking is not displayed");
        objlogger=objext.createTest("Your Booking tab");
		
		objlogger.log(Status.FAIL,"Your Booking tab");	

	}
	
	
//    objlogger=objext.createTest("Your Booking tab");
//	
//	objlogger.log(Status.INFO,"Your Booking tab is visiable.");	
//	
	
	//***********Find A Room******************** 
	driver.switchTo().defaultContent();
	ImplicitWait(20);
	driver.switchTo().frame("leftNavigation");
	ImplicitWait(20);
	
	click(objRoomBooking.FindARoomTab);
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	driver.switchTo().frame("mainDisplayFrame");
	

	
	
  WebElement Find_A_Room_Page  =ExplicitwaitForElementAndReturn(objRoomBooking.FindARoomPage,120);
	
  Boolean findroom=Find_A_Room_Page.isDisplayed();
  
  objsoftassert.assertTrue(yourbooking); 
	if(findroom)
	{
		System.out.println("Find A Room is displayed");
		
         objlogger=objext.createTest("Room Booking & Home tab");
		
		objlogger.log(Status.PASS,"Room Booking & Home");	
	}
	
	else{
		
		System.out.println("Find A Room is not displayed");
	     
        objlogger=objext.createTest("Find A Room ");
		
		objlogger.log(Status.FAIL,"Find A Room ");	
	}
	
  //      objlogger=objext.createTest("Find A Room tab");
 //		  objlogger.log(Status.INFO,"Find A Room tab is visiable.");	
//	
	//**************Booking Grid*******************************************************************
	
	
	
	
	driver.switchTo().defaultContent();
	ImplicitWait(20);
	driver.switchTo().frame("leftNavigation");
	ImplicitWait(20);
	
	click(objRoomBooking.BookingGridTab);
	driver.switchTo().defaultContent();
	ImplicitWait(20);
	driver.switchTo().frame("mainDisplayFrame");
	

	
	
  WebElement Booking_Grid  =ExplicitwaitForElementAndReturn(objRoomBooking.BookingGridPage,120);
	
	if(Booking_Grid.isDisplayed()==true)
	{
		System.out.println("Booking Grid is displayed");
	}
	
	else{
		
		System.out.println("Booking Grid is not displayed");
	
	}
	  objlogger=objext.createTest("Booking Grid tab");
	
	  objlogger.log(Status.INFO,"Booking Grid of Room Booking is visiable");
	
	//**************Advance Booking Grid******************
	
	//**************Delivery Tab******************
	
	driver.switchTo().defaultContent();
	ImplicitWait(20);
	driver.switchTo().frame("leftNavigation");
	ImplicitWait(20);
	
	click(objRoomBooking.DeliveryPointTab);
	driver.switchTo().defaultContent();
	ImplicitWait(20);
	driver.switchTo().frame("mainDisplayFrame");
	
	
	WebElement Deliverypoint  =ExplicitwaitForElementAndReturn(objRoomBooking.DeliveryPointPage,120);
	
	if(Deliverypoint.isDisplayed()==true)
	{
		System.out.println("Delivery Tab is displayed");
	}
	else{
		System.out.println("Delivery Tab is not displayed");
	}
	
	objlogger=objext.createTest("Delivery tab");
	
	  objlogger.log(Status.INFO,"Delivery tab is visiable");
	//**************Request Tab******************
	
	
	driver.switchTo().defaultContent();
	ImplicitWait(20);
	driver.switchTo().frame("leftNavigation");
	ImplicitWait(20);
	
	click(objRoomBooking.RequestTab);
	driver.switchTo().defaultContent();
	ImplicitWait(20);
	driver.switchTo().frame("mainDisplayFrame");
	
	
WebElement request  =ExplicitwaitForElementAndReturn(objRoomBooking.RequestPage,120);
	
	if(request.isDisplayed()==true)
	{
		System.out.println("Request Tab is displayed");
	}
	else{
		System.out.println("Request Tab is not displayed");
	}
	
	  objlogger=objext.createTest("Request tab");
	
	  objlogger.log(Status.INFO,"Request tab is visiable");
	
	//**************Find Bookings******************
	
	driver.switchTo().defaultContent();
	ImplicitWait(20);
	driver.switchTo().frame("leftNavigation");
	ImplicitWait(20);
	
	click(objRoomBooking.FindBookingsTab);
	driver.switchTo().defaultContent();
	ImplicitWait(20);
	driver.switchTo().frame("mainDisplayFrame");
	
	
WebElement findbookings  =ExplicitwaitForElementAndReturn(objRoomBooking.FindBookingsPage,120);
	
	if(findbookings.isDisplayed()==true)
	{
		System.out.println("Find Bookings Tab is displayed");
	}
	else{
		System.out.println("Find Bookings is not displayed");
	}
	
	
	 objlogger=objext.createTest("Find Bookings tab");
		
	  objlogger.log(Status.INFO,"Find Bookings tab is visiable");
	  objext.flush();
	//**************Room Booking Users Tab ****************** 
	
	driver.switchTo().defaultContent();
	ImplicitWait(20);
	driver.switchTo().frame("leftNavigation");
	ImplicitWait(20);
	
	click(objRoomBooking.UserTab);
	driver.switchTo().defaultContent();
	ImplicitWait(20);
	driver.switchTo().frame("mainDisplayFrame");
	
	
   WebElement user  =ExplicitwaitForElementAndReturn(objRoomBooking.Userpage,120);
	
	if(user.isDisplayed()==true)
	{
		System.out.println("User Tab of Room Bookings is displayed");
	}
	else{
		System.out.println("User Tab of Room Bookings is not displayed");
	
	
	  objlogger=objext.createTest("Users Tab of Room Booking");
	
	  objlogger.log(Status.INFO,"Users Tab of Room Booking is visiable");
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
