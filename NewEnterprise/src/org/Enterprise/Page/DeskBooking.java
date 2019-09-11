package org.Enterprise.Page;

import org.slf4j.LoggerFactory;
import org.Enterprise.Base.DriverUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DeskBooking {

	@FindBy (xpath="//div[@id='DeskBookingHeader']")
    public WebElement DeskbookingsTab;
  
    @FindBy (xpath="//h2[contains(text(),'Quick desk search')]")
    public WebElement Deskbookingpage; 
    
    @FindBy (xpath="//li[@id='li9']")
    public WebElement HomeTab;
	
    @FindBy (xpath="//h2[contains(text(),'Quick desk search')]")
    public WebElement Homepage;
    
    @FindBy (xpath="//li[@id='li_yourBooking_desk']")
    public WebElement YourBookingsTab;
    
    @FindBy (xpath="//h1[@id='bookingFormTitle']")
    public WebElement YourBookingsPage;
    
    @FindBy (xpath="//li[@id='li_findADesk']")
    public WebElement FindADeskTab;
    
    @FindBy (xpath="//h1[contains(text(),'Find a Desk')]")
    public WebElement FindADeskPage;
    
    @FindBy (xpath="//li[@id='li_bookingGrid_desk']")
    public WebElement BookingGridTab;
    
    @FindBy (xpath="//div[@class='grid-view-type']")
    public WebElement BookingGridPage;
    

    @FindBy (xpath="//a[@id='A15']")
    public WebElement FindAColleagueTab;
    
    @FindBy (xpath="//h1[contains(text(),'Find a Colleague')]")
    public WebElement FindAColleaguepage;
    
    
    @FindBy (xpath="//li[@id='li_userAdmin_desk']")
    public WebElement UsersTab;
    
    @FindBy (xpath="//h1[@id='bookingFormTitle']")
    public WebElement Userspage;
    
    
    
}
