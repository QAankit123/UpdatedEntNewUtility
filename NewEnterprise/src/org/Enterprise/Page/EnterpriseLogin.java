package org.Enterprise.Page;

import org.Enterprise.Base.DriverUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterpriseLogin  {

	@FindBy(xpath="//input[@id='txtUserName']")
	public WebElement username;
	
	@FindBy(xpath="//input[@name='txtPassword']")
	public WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	public WebElement loginbtn;
	
	@FindBy(xpath="//button[text()='Go to app']")
	public WebElement  goToapp;
	
	@FindBy(xpath="//th[text()='TITLE']")
	public WebElement  details;
	
	@FindBy(xpath="//*[@*='logout_link']")
	public WebElement logout;
	
	
}
   