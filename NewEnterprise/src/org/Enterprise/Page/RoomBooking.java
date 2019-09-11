package org.Enterprise.Page;

import org.slf4j.LoggerFactory;
import org.Enterprise.Base.DriverUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoomBooking {
	
	@FindBy(xpath="//div[@id='RoomBookingHeader']")
	public WebElement MainRoomBookingTab;
	
	@FindBy(xpath="//span[@id='welcomeHeader']")
	public WebElement MainRoomBookingPage;
	  

	@FindBy(xpath="//div[@id='RoomBookingHeader']")
	public WebElement RoomBookingTab;     
	
	@FindBy(xpath="//h2[contains(text(),'Quick room search')]")
	public WebElement QuickRoomSearchPage;
	
    @FindBy(xpath="//li[@id='li_newwelcome_room']")
    public WebElement HomeTab;
    
    @FindBy (xpath="//a[@id='A291']")
    public WebElement YourbookingsTab;
  
    @FindBy (xpath="//h1[@id='bookingFormTitle']")
    public WebElement yourbookingpage;
    
    @FindBy (xpath="//li[@id='li_FindARoom1']")
    public WebElement FindARoomTab;
    
    @FindBy (xpath="//h1[@class='pageTitle bookingTitle']")
    public WebElement FindARoomPage;
	
    @FindBy(xpath="//li[@id='li_bookingGrid_room']")
    public WebElement BookingGridTab;
    
    @FindBy(xpath="//button[@id='btnTodayDate']")
    public WebElement BookingGridPage;
    
    @FindBy(xpath="//a[@id='linkadvancedRoomBookingGrid']")
    public WebElement AdvanceGrid;
    
    @FindBy(xpath="//li[@id='li_deliveryPoint']")
    public WebElement DeliveryPointTab;
    
    @FindBy(xpath="//input[@id='gen_meetingTitle']")
    public WebElement DeliveryPointPage;
    
    @FindBy(xpath="//li[@id='li_UsersRequests']")
    public WebElement RequestTab;
    
    @FindBy(xpath="//h1[@id='bookingFormTitle']")
    public WebElement RequestPage;
    
    @FindBy(xpath="//li[@id='li_findBookings']")
    public WebElement FindBookingsTab;
    
    @FindBy(xpath="//h1[@id='bookingFormTitle']")
    public WebElement FindBookingsPage;
    
    @FindBy(xpath="//a[@id='A11']")
    public WebElement UserTab;
    
    @FindBy(xpath="//h1[@id='bookingFormTitle']")
    public WebElement Userpage;
    
}
