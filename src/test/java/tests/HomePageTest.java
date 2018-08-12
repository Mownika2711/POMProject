package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AddNewCustomerPage;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	AddNewCustomerPage objNewCustomer;
	
	public HomePageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyWelcomeMessage()
	{
		String actualWelcomeMessage=homePage.verifyWelcomeMessage();
		Assert.assertEquals(actualWelcomeMessage, "Welcome To Manager's Page of Guru99 Bank","Incorrect Welcome Message");
	}
	
	@Test
	public void verifyManagerID()
	{
		String actualManagerIDdisplay=homePage.verifyManagerIdDisplay();
		Assert.assertEquals(actualManagerIDdisplay, "Manger Id : "+prop.getProperty("userName"),"Manager ID not matched");
	}
	
	@Test
	public void clickNewCustomerLink()
	{
		objNewCustomer=homePage.clickOnNewCustomer();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
