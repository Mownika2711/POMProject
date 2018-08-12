package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class AddNewCustomerPage extends TestBase{
	
	@FindBy(name="name")
	WebElement customerName;
	
	@FindBy(id="dob")
	WebElement dateOfBirth;
	
	@FindBy(name="addr")
	WebElement address;
	
	@FindBy(name="city")
	WebElement customerCity;
	
	@FindBy(name="state")
	WebElement customerState;
	
	@FindBy(name="pinno")
	WebElement pinNumber;
	
	@FindBy(name="telephoneno")
	WebElement mobileNumber;
	
	@FindBy(name="emailid")
	WebElement emailId;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="sub")
	WebElement submitBtn;
	
	public AddNewCustomerPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addNewCustomer(String name,String gender,String dob,String addr,String city,String state,String pin,String mobile,String email,String pwd)
	{
		customerName.sendKeys(name);
		if(gender.equalsIgnoreCase("male"))
			driver.findElement(By.xpath("//input[@name='rad1'][1]")).click();
		else
			driver.findElement(By.xpath("//input[@name='rad1'][2]")).click();
		dateOfBirth.sendKeys(dob);
		address.sendKeys(addr);
		customerCity.sendKeys(city);
		customerState.sendKeys(state);
		pinNumber.sendKeys(pin);
		mobileNumber.sendKeys(mobile);
		emailId.sendKeys(email);
		password.sendKeys(pwd);
		submitBtn.click();	
	}
}
