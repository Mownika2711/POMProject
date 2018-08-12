package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name="uid")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement loginBtn;
	
	@FindBy(name="btnReset")
	WebElement resetBtn;
	
	@FindBy(xpath="//a[text()='here']")
	WebElement visitHereLink;
	
	@FindBy(id="message23")
	WebElement userIdErrorMessage;
	
	@FindBy(id="message18")
	WebElement passwordErrorMessage;
	
	@FindBy(xpath="//h2[text()='Guru99 Bank']")
	WebElement label;
	
	//Initializing page objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String verifyLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyLabelDisplay()
	{
		return label.isDisplayed();
	}
	
	public HomePage login(String un,String pwd)
	{
		userName.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
}
