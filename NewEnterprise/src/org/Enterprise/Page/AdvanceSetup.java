package org.Enterprise.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    public class AdvanceSetup {

	@FindBy(xpath="//span[text()='Advanced Setup']")
	public WebElement AdvanceSetupTab;	
	
	@FindBy(xpath="//a[@id='A27']")
	public WebElement AboutTab;	
	
	@FindBy(xpath="strong[text()='   You have all the latest updates.']")
	public WebElement AboutPage;
	
	@FindBy(xpath="//a[@id='A28']")
	public WebElement LicenceTab;
	
	@FindBy(xpath="//span[text()='Licensing']")
	public WebElement LicencePage;
	
	@FindBy(xpath="//a[@id='A6']")
	public WebElement TagHeadingsTab;
	
	@FindBy(xpath="//h1[text()='Email tag headings']")
	public WebElement TagHeadingsPage;
	
	@FindBy(xpath="//a[@id='A64']")
	public WebElement GlobalEmailSetupTab;
	
	@FindBy(xpath="//h1[text()='Email Template']")
	public WebElement GlobalEmailSetuppage;
	
	@FindBy(xpath="//a[@id='A1']")
	public WebElement GlobalSetupTab;
	
	@FindBy(xpath="//span[@id='__tab_TabContainer_applicationSetup_TabPanel_emailSMS']")
	public WebElement GlobalSetupPage;
	
	@FindBy(xpath="//li[@id='li_ScreenDashboard']")
	public WebElement ScreenAdminTab;
	
	@FindBy(xpath="//span[@id='ctl00_lblHeading']")
	public WebElement ScreenAdminPage;
	
	@FindBy(xpath="//li[@id='li_admapping']")
	public WebElement ADMappingTab;
	
	@FindBy(xpath="//span[text()='Your Active Directory Mappings']")
	public WebElement ADMappingPage;
	
	@FindBy(xpath="//a[@id='A26']")
	public WebElement ClearCacheTab;
	
	@FindBy(xpath="//input[@name='btnClearAll']")
	public WebElement ClearCachePage;
	
	
    	
}