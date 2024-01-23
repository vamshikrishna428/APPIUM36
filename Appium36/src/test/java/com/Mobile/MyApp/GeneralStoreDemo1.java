package com.Mobile.MyApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GeneralStoreDemo1 {
	@Test
	public void generalStoreDemo1() throws MalformedURLException {
		DesiredCapabilities desiredcapabilities=new DesiredCapabilities();
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredcapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		desiredcapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 30");
		
		desiredcapabilities.setCapability("appPackage", "com.androidsample.generalstore");
		desiredcapabilities.setCapability("appActivity", ".SplashActivity");
		desiredcapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		desiredcapabilities.setCapability(MobileCapabilityType.FULL_RESET,false);
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, desiredcapabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		scroolTillElement(driver, "text", "Benin");
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("vamshi");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();		
		String message = driver.findElement(By.xpath("//android.widget.Toast[1]")).getText();
		System.out.println(message);	
		
		
			
		
	}
	public static void scroolTillElement(AndroidDriver driver,String an,String av) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}
	
	
}
