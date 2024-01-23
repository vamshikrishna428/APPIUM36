package com.Mobile.MyApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppMethods {
	@Test
	public void appMethods() throws MalformedURLException {
		DesiredCapabilities desiredcapabilites=new DesiredCapabilities();
		desiredcapabilites.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredcapabilites.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredcapabilites.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		desiredcapabilites.setCapability("appPackage", "com.androidsample.generalstore");
		desiredcapabilites.setCapability("appActivity", ".SplashActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver =new AndroidDriver(url, desiredcapabilites);
		
		
	}
	
	
	

}
