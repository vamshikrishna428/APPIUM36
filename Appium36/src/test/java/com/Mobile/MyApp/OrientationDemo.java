	package com.Mobile.MyApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class OrientationDemo {
	@Test
	public void orientation() throws MalformedURLException, InterruptedException {
		DesiredCapabilities desiredcapabilities=new DesiredCapabilities();
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredcapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		desiredcapabilities.setCapability("appPackage", "io.appium.android.apis");
		desiredcapabilities.setCapability("appActivity", ".ApiDemos");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, desiredcapabilities);
		ScreenOrientation orient=driver.getOrientation();
		driver.rotate(orient.PORTRAIT);
		Thread.sleep(5000);
		driver.rotate(orient.LANDSCAPE);
		
		
		
		
		
	}
	
	
}
