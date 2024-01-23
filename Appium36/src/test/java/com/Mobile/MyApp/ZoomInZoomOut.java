package com.Mobile.MyApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class ZoomInZoomOut {
	@Test
	public void zoominzoomout() throws MalformedURLException {
		AppiumDriverLocalService service=AppiumDriverLocalService.buildDefaultService();
		service.start();
		
		DesiredCapabilities desiredcapabilities=new DesiredCapabilities();
		desiredcapabilities.setCapability("platformName", "Android");
		desiredcapabilities.setCapability("automationName","Appium");
		desiredcapabilities.setCapability("platformVersion", "11");
		desiredcapabilities.setCapability("deviceId", "emulator-5554");
		desiredcapabilities.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		desiredcapabilities.setCapability("appActivity", ".mainActivity");
		desiredcapabilities.setCapability("noReset", true);
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, desiredcapabilities);

		
	}
}
