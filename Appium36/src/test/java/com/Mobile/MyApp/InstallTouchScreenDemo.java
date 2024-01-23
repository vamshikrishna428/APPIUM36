package com.Mobile.MyApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallTouchScreenDemo {
	@Test
	public void touchScreenDemo() throws MalformedURLException {
		DesiredCapabilities desiredcapabilities= new DesiredCapabilities();
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredcapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		desiredcapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Vamshi\\Downloads\\TouchScreenTest_v1.7.14_apkpure.com.apk");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, desiredcapabilities);
		
		
		
	}
}
