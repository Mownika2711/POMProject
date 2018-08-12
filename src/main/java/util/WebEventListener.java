package util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import base.TestBase;

public class WebEventListener extends TestBase implements WebDriverEventListener{

	public void afterAlertAccept(WebDriver driver) {
		System.out.println("Alert Accepted");
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		System.out.println("Alert Dismissed");
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("Element value changed to: "+element.toString() );
		
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("Clicked on "+ element.toString());
		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Trying to find element by: "+by.toString());
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		
	}

	public void afterGetText(WebElement element, WebDriver driver, String arg2) {
		// TODO Auto-generated method stu
		
	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("Navigated Back");
		
	}

	public void afterNavigateForward(WebDriver driver) {
		System.out.println("Navigated forward");
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("Page refreshed");
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("After navigated to: "+url);
		
	}

	public void afterScript(String url, WebDriver driver) {
		System.out.println("Switched to: "+url);
		
	}

	public void afterSwitchToWindow(String arg0, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertAccept(WebDriver driver) {
		System.out.println("Trying to accept the alert");
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		System.out.println("Trying to dismiss the alert");
		
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Trying to click on: "+element.toString());
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Trying to find element: "+by.toString());
		
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		System.out.println("Trying to get text from element:" +element.toString());
		
	}

	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Trying to navigate back");
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Trying to navigate forward");
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("Trying to refresh the window");
		
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before navigate to: "+url);
		
	}

	public void beforeScript(String arg0, WebDriver driver) {
		System.out.println("Trying to navigate forward");
	}

	public void beforeSwitchToWindow(String url, WebDriver driver) {
		System.out.println("Trying to switch to :" + url);
		
	}

	public void onException(Throwable error, WebDriver driver) {
		System.out.println("Exception occured " +error);
		try
		{
			TestUtil.takeScreenshot();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] arg2) {
		System.out.println("Value of the:"+element.toString() + " before any changes made");
		
	}
	

}
