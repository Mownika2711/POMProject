package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
	}
	
	//verify login page title
	//@Test(priority=1,retryAnalyzer=analyzer.RetryAnalyzer.class)
	@Test(priority=1)
	public void verifyLoginPageTitle()
	{
		String actualPageTitle=loginPage.verifyLoginPageTitle();
		Assert.assertEquals(actualPageTitle, "Guru99 Bank Home Page","Login page title not matches");
	}
	
	
	//verify label display
	@Test(priority=2)
	public void verifyLabelDisplay()
	{
		Assert.assertTrue(loginPage.verifyLabelDisplay(),"Loginpage Label not found");
	}
	
	//verify login function
	@Test(priority=3)
	public void loginTest()
	{
		homePage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
