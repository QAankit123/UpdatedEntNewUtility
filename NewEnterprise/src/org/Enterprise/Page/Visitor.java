package org.Enterprise.Page;

import org.slf4j.LoggerFactory;
import org.Enterprise.Base.DriverUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Visitor {

	@FindBy(xpath="//div[@id='VisitorsHeader']")
	public WebElement VisitorsTab;
	
	@FindBy(xpath="//span[@id='welcomeHeader']")
	public WebElement VisitorsPage;
	
	@FindBy(xpath="//li[@id='li_visitorsHome']")
	public WebElement HomeTab;
	
	@FindBy(xpath="//span[@id='welcomeHeader']")
	public WebElement HomePage;
	
	//Find A visitor Page and Visitors sub tab undre the Visitors main tab 
	
	@FindBy(xpath="//li[@id='li_findVisitor']")
	public WebElement FindAVisitorTab;
	
	@FindBy(xpath="//h1[contains(text(),'Find a Visitor')]")
	public WebElement FindAVisitorPage;
	
	
	@FindBy(xpath="//li[@id='li_myVisitor']")
	public WebElement YourVisitorTab;
	
	@FindBy(xpath="//h1[contains(text(),'Your Visitors')]")
	public WebElement YourVisitorPage;
	
	@FindBy(xpath="//li[@id='li_contacts_n']")
	public WebElement ContactsTab;
	
	@FindBy(xpath="//span[contains(text(),'First name')]")
	public WebElement ContactsPage;
	
	
	
}
