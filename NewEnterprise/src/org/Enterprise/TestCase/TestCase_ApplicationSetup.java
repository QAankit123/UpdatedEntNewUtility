package org.Enterprise.TestCase;

import java.util.ResourceBundle;

import org.Enterprise.Base.ActionsUtilities;
import org.Enterprise.Page.ApplicationSetup;
import org.Enterprise.Page.EnterpriseLogin;
import org.Enterprise.Page.RoomBooking;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

    public class TestCase_ApplicationSetup extends ActionsUtilities {
	
	ResourceBundle objResourceBundle = ResourceBundle.getBundle("Config"); 
	
	EnterpriseLogin objEnterpriseLogin;
	
	ApplicationSetup objApplicationSetup;
	
	ActionsUtilities objActionsUtilities;
	
	boolean LoginStatus= false;
	 
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
	        
             @Test(priority=1)
             
             public void TestCaseApplicationSetup() throws InterruptedException{
            	//try{
            	//Code for Enterprise login
            		objEnterpriseLogin=PageFactory.initElements(driver, EnterpriseLogin.class);
            		objApplicationSetup=PageFactory.initElements(driver,ApplicationSetup.class);
            		ExplicitwaitForElement(objEnterpriseLogin.username, 120);
            		sendKeys(objEnterpriseLogin.username,objResourceBundle.getString("user_name"));
            		sendKeys(objEnterpriseLogin.password,objResourceBundle.getString("user_password"));
            		click(objEnterpriseLogin.loginbtn);
            	    Thread.sleep(8000);
            		//ExplicitwaitForElement(objEnterpriseLogin.goToapp, 120);
            	   click(objEnterpriseLogin.goToapp);
            	    
            	    //driver.switchTo().frame("mainDisplayFrame");
            	   //objActionsUtilities.SwitchDriverControl("mainDisplayFrame"); 
            	   
            	 //*********************Application Setup*****************
            	   ImplicitWait(20);
           		   driver.switchTo().defaultContent();
           		   ImplicitWait(20);
           		   driver.switchTo().frame("leftNavigation");
           		   ImplicitWait(20);  
            	   
           		   
           		   
           		   click(objApplicationSetup.ApplicationSetupTab);
           		   ImplicitWait(20);
           		   
           		   System.out.println("Application setup Tab is displayed");
           		   
           		   
           		   
           		objlogger=objext.createTest("Application Setup Tab ");
           		   //objlogger.log(Status.INFO,"Room Booking & Home");
           		   objlogger.log(Status.PASS, "Application Setup Tab");
           		   
           		   //**************************Location Tab*******************
           		   
           		   click(objApplicationSetup.LocationTab);
           		   
           		   driver.switchTo().defaultContent();
           		   ImplicitWait(20);
           		   driver.switchTo().frame("mainDisplayFrame");
           		   
           		WebElement Location  =ExplicitwaitForElementAndReturn(objApplicationSetup.LocationPage,120);
           		
           		if(Location.isDisplayed()==true)
           		{
           			System.out.println("Location Tab is displayed");
           			
           			   objext.createTest("Location  Tab ");
            		   //objlogger.log(Status.INFO,"Room Booking & Home");
           			objlogger=objlogger.log(Status.PASS, "Application Setup Tab");
           		}
           		else{
           			System.out.println("Location Tab is not displayed");
           			
           			objlogger=objext.createTest("Location Tab ");
         		
         		   objlogger.log(Status.FAIL, "Application Setup Tab");
        		}
           		
           		//********************Group Tab*************************************
           		
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("leftNavigation");
           		ImplicitWait(20);
           		
           		click(objApplicationSetup.GroupTab);
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("mainDisplayFrame");
           		
           		WebElement Group  =ExplicitwaitForElementAndReturn(objApplicationSetup.GroupPage,120);
           		   

           		if(Group.isDisplayed()==true)
           		{
           			System.out.println("Group Tab is displayed");
           			objlogger=objext.createTest("Group  Tab ");
             		
          		   objlogger.log(Status.PASS, "Group Tab");
           		}
           		else{
           			System.out.println("Group Tabis not played");
           			
           			objlogger=objext.createTest("Location Tab ");
             		
          		   objlogger.log(Status.FAIL, "Application Setup Tab");
           			
           		}
                
           		//**********************************Resource Tab************************ 
           		
           		
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("leftNavigation");
           		ImplicitWait(20);
           		
           		click(objApplicationSetup.ResourceTab);
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("mainDisplayFrame");
           		
           		WebElement resource  =ExplicitwaitForElementAndReturn(objApplicationSetup.ResourcePage,120);
           		
           		if(resource.isDisplayed()==true)
           		{
           			System.out.println("Resource Tab is displayed");
           			objlogger=objext.createTest("Resource  Tab ");
             		
          		   objlogger.log(Status.PASS, "Resource Tab");
           		}
           		else{
           			System.out.println("Resource Tab is not displayed");
           			
           			objlogger=objext.createTest("Location Tab ");
             		
          		   objlogger.log(Status.FAIL, "Resource Tab");
           			
           		}
           		   
           		//************************************************Linked Rooms***********************
           		
           		
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("leftNavigation");
           		ImplicitWait(20);
           		
           		click(objApplicationSetup.LinkedRoomTab);
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("mainDisplayFrame");
           		
                 WebElement linkedroom  =ExplicitwaitForElementAndReturn(objApplicationSetup.LinkedRoomPage,120);
           		
           		if(linkedroom.isDisplayed()==true)
           		{
           			System.out.println("Linked Room Tab is displayed");
           			objlogger=objext.createTest("LinkedRoom  Tab ");
             		
          		   objlogger.log(Status.PASS, "LinkedRoom Tab");
           		}
           		else{
           			System.out.println("Linked Room Tab is not displayed");
           			
           			objlogger=objext.createTest("LinkedRoom  Tab ");
             		
          		   objlogger.log(Status.FAIL, "LinkedRoom  Tab ");
           			
           		}
           		
           		//******************************Floor Plans*****************************
           		
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("leftNavigation");
           		ImplicitWait(20);
           		
           		click(objApplicationSetup.FloorPlanTab);
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("mainDisplayFrame");
           		
                 WebElement FloorPlan  =ExplicitwaitForElementAndReturn(objApplicationSetup.FloorPlanPage,120);
           		
           		if(FloorPlan.isDisplayed()==true)
           		{
           			System.out.println("Floor Plan Tab is displayed");
           			objext.createTest("FloorPlan  Tab ");
             		
          		   objlogger.log(Status.PASS, "FloorPlan Tab");
           		}
           		else{
           			System.out.println("Floor Plan Tab is not displayed");
           			
           			objext.createTest("Floor Plan  Tab ");
             		
          		   objlogger.log(Status.FAIL, "Floor Plan  Tab ");
           			
           		}
           		
           		//***********************************Services Tab**************************8
           		
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("leftNavigation");
           		ImplicitWait(20);
           		
           		click(objApplicationSetup.ServiceTab);
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("mainDisplayFrame");
           		
                WebElement service  =ExplicitwaitForElementAndReturn(objApplicationSetup.ServicePage,120);
           		
           		if(service.isDisplayed()==true)
           		{
           			System.out.println("Service Tab is displayed");
           			objext.createTest("service  Tab ");
             		
          		   objlogger.log(Status.PASS, "service Tab");
           		}
           		else{
           			System.out.println("service Tab is not displayed");
           			
           			objext.createTest("service  Tab ");
             		
          		   objlogger.log(Status.FAIL, "service  Tab ");
           			
           		}
           		//********************************************MetaAdmin********************
           		
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("leftNavigation");
           		ImplicitWait(20);
           		
           		click(objApplicationSetup.MetaAdminTab);
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("mainDisplayFrame");
           		
           	  WebElement MetaAdmin  =ExplicitwaitForElementAndReturn(objApplicationSetup.MetaAdminPage,120);
           		
           		if(MetaAdmin.isDisplayed()==true)
           		{
           			System.out.println("MetaAdmin Tab is displayed");
           			objext.createTest("MetaAdmin Tab ");
             		
          		   objlogger.log(Status.PASS, "MetaAdmin Tab");
           		}
           		else{
           			System.out.println("MetaAdmin Tab is not displayed");
           			
           			objext.createTest("MetaAdmin  Tab ");
             		
          		   objlogger.log(Status.FAIL, "MetaAdmin  Tab ");
           			
           		}
           	  //***********************************Vendors Tab****************************
           		
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("leftNavigation");
           		ImplicitWait(20);
           		
           		click(objApplicationSetup.VendorTab);
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("mainDisplayFrame");
           		
               WebElement vendor  =ExplicitwaitForElementAndReturn(objApplicationSetup.VendorPage,120);
           		
           		if(vendor.isDisplayed()==true)
           		{
           			System.out.println("vendor Tab is displayed");
           			objext.createTest("vendor Tab ");
             		
          		   objlogger.log(Status.PASS, "vendor Tab");
           		}
           		else{
           			System.out.println("vendor Tab is not displayed");
           			
           			objext.createTest("vendor  Tab ");
             		
          		   objlogger.log(Status.FAIL, "vendor  Tab ");
           			
           		}
           		
           		//*********************************Home Setup****************************
           		
           		
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("leftNavigation");
           		ImplicitWait(20);
           		
           		click(objApplicationSetup.HomeSetupTab);
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("mainDisplayFrame");
           		
               WebElement HomeSetup  =ExplicitwaitForElementAndReturn(objApplicationSetup.HomeSetupPage,120);
           		
           		if(HomeSetup.isDisplayed()==true)
           		{
           			System.out.println("HomeSetup Tab is displayed");
           			objext.createTest("HomeSetup Tab ");
             		
          		   objlogger.log(Status.PASS, "HomeSetup Tab");
           		}
           		else{
           			System.out.println("HomeSetup Tab is not displayed");
           			
           			objext.createTest("HomeSetup Tab ");
             		
          		   objlogger.log(Status.FAIL, "HomeSetup  Tab ");
           			
           		}
           		
           		//********************************Visitor Setup**************************8
           		
           		
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("leftNavigation");
           		ImplicitWait(20);
           		
           		click(objApplicationSetup.VisitorSetupTab);
           		driver.switchTo().defaultContent();
           		ImplicitWait(20);
           		driver.switchTo().frame("mainDisplayFrame");
           		
                WebElement VisitorSetup  =ExplicitwaitForElementAndReturn(objApplicationSetup.VisitorSetupPage,120);
           		
           		if(VisitorSetup.isDisplayed()==true)
           		{
           			System.out.println("VisitorSetup Tab is displayed");
           			objext.createTest("VisitorSetup Tab ");
             		
          		   objlogger.log(Status.PASS, "VisitorSetup Tab");
           		}
           		else{
           			System.out.println("VisitorSetup Tab is not displayed");
           			
           			objext.createTest("VisitorSetup Tab ");
             		
          		   objlogger.log(Status.FAIL, "VisitorSetup  Tab ");
           			
           		}
           		
            	//} 
//             catch (Exception e)
//            	{	 
//            	 driver.switchTo().defaultContent();
//         		 ImplicitWait(20);
//         		 click(objEnterpriseLogin.logout); 
//         		 ImplicitWait(20);
//         		 System.out.println("catch block executed");
//         		 driver.close();
//            	}
            	
            	 driver.switchTo().defaultContent();
        		 ImplicitWait(20);
        		 click(objEnterpriseLogin.logout); 
        		 ImplicitWait(20);
        		 System.out.println("Final Logout");            	
            	
             }
         
}
