package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//marquee[@class='heading3']")
	WebElement welcomeMessage;
	
	@FindBy(xpath="//td[@style='color: green']")
	WebElement managerIdDisplay;
	
	@FindBy(linkText="New Customer")
	WebElement newCustomerlink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyWelcomeMessage()
	{
		return welcomeMessage.getText();
	}
	
	public String verifyManagerIdDisplay()
	{
		return managerIdDisplay.getText();
	}
	
	//click on new customer link
	public AddNewCustomerPage clickOnNewCustomer()
	{
		newCustomerlink.click();
		
		return new AddNewCustomerPage();
	}
	

}
