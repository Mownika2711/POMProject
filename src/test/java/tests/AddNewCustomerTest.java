package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AddNewCustomerPage;
import pages.HomePage;
import pages.LoginPage;
import util.TestUtil;

public class AddNewCustomerTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	AddNewCustomerPage addNewCustomerPage;
	
	String sheetName="NewCustomer";
	
	public AddNewCustomerTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		addNewCustomerPage=homePage.clickOnNewCustomer();
	}
	
	@Test(dataProvider="getTestData")
	public void createNewCustomer(String name,String gender,String dob,String addr,String city,String state,String pin,String mobile,String email,String pwd)
	{
		addNewCustomerPage.addNewCustomer(name, gender, dob, addr, city, state, pin, mobile, email, pwd);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getTestData()
	{
		Object[][] data=TestUtil.readExceldata(sheetName);
		return data;
	}

}
