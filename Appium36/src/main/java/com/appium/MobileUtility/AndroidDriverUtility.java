package com.appium.MobileUtility;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class AndroidDriverUtility {
AndroidDriver<WebElement> driver;
	
	public AndroidDriver<WebElement> intializeAndroidDriver(URL url,DesiredCapabilities capabilities) {
		 return driver=new AndroidDriver<WebElement>(url,capabilities);
	}
	
	/**
	 * this mrthod is used intall th app
	 * Should give app location as path
	 * @param path
	 */
	public void installApp(String path) {
		driver.installApp(path);
	}

	public void launchApp() {
		driver.launchApp();
	}
	
	public void closeApp() {
		driver.closeApp();
	}
	
	public void switchToAnotherApp(String appPackage,String appActivity) {
		driver.startActivity(appPackage, appActivity);
	}
	
	public void singletapOnElement(MobileElement element) {
		driver.tap(1, element, 1000);
	}
	public void singletapOnCoOrdinate(int x, int y) {
		driver.tap(1, x, y, 1000);
	}
	
	public void swipe(int start_x, int start_y, int end_x, int end_y ) {
		driver.swipe(start_x, start_y, end_x, end_y, 1000);
	}
	
	public void scrollToElement(String an, String av) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}
	
	public void implicitWait(long to) {
		driver.manage().timeouts().implicitlyWait(to,TimeUnit.SECONDS);
	}
	
}

