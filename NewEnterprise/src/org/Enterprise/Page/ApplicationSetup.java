package org.Enterprise.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationSetup {

	
	@FindBy(xpath="//div[@id='ApplicationSetupHeader']")
	public WebElement ApplicationSetupTab;
	
	@FindBy(xpath="//li[@id='Li6']")
	public WebElement RoomMappingTab;
	
	@FindBy(xpath="//h1[@class='pageTitle']")
	public WebElement RoomMappingPage;
	
	@FindBy(xpath="//li[@id='li_adminLocation']")
	public WebElement LocationTab;
	
	@FindBy(xpath="//td[@class='bookingTitle']")
	public WebElement LocationPage;
	
	@FindBy(xpath="//a[@id='A65']")
	public WebElement GroupTab;
	
	@FindBy(xpath="//td[text()='Group Administration']")
	public WebElement GroupPage;
	
	@FindBy(xpath="//a[@id='A70']")
	public WebElement ResourceTab;
	
	@FindBy(xpath="//td[text()='Resource Administration']")
	public WebElement ResourcePage;
	
	@FindBy(xpath="//a[@id='A21']")
	public WebElement LinkedRoomTab;
	
	@FindBy(xpath="//td[text()='Linked Rooms']")
	public WebElement LinkedRoomPage;
	
	@FindBy(xpath="//a[@id='A66']")
	public WebElement FloorPlanTab;
	
	@FindBy(xpath="//td[text()='Floor Plan Administration']")
	public WebElement FloorPlanPage;
	
	@FindBy(xpath="//a[@id='A23']")
	public WebElement ServiceTab;
	
	@FindBy(xpath="//td[text()='Service Administration']")
	public WebElement ServicePage;
	
	@FindBy(xpath="//a[@id='A24']")
	public WebElement MetaAdminTab;
	
	@FindBy(xpath="//h1[text()='Meta Administration']")
	public WebElement MetaAdminPage;
	
	@FindBy(xpath="//a[@id='A9']")
	public WebElement VendorTab;
	
	@FindBy(xpath="//td[text()='Vendor Admin']")
	public WebElement VendorPage;
	
	@FindBy(xpath="//a[@id='A4']")
	public WebElement HomeSetupTab;
	
	@FindBy(xpath="//td[text()='Welcome Page']")
	public WebElement HomeSetupPage;
	
	@FindBy(xpath="//a[@id='A32']")
	public WebElement VisitorSetupTab;
	
	@FindBy(xpath="//h1[@id='bookingFormTitle']")
	public WebElement VisitorSetupPage;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
}
