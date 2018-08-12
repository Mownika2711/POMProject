package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import util.TestUtil;
import util.WebEventListener;

public class TestBase {
	
	//Declaring driver and property as a public variable which can be accessible in all the child classes
	public static WebDriver driver;
	public static Properties prop;
	public static WebEventListener eventListener;
	public static EventFiringWebDriver e_driver;
	
	//Read the properties file in constructor
	public TestBase()
	{
		try
		{
			prop=new Properties();
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+
					"\\src\\main\\java\\config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Initialize browser
	public static void initialization()
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\java\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\src\\main\\java\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		/*e_driver=new EventFiringWebDriver(driver);
		eventListener=new WebEventListener();
		e_driver.register(eventListener);
		driver=e_driver;*/
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//To delete Cookies
		driver.manage().deleteAllCookies();
		
		//Define pageloadTimeout
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		
		//Define implicitwait
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		//Launch the base URL of the application
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	

}
