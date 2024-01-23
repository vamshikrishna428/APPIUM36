package com.Mobile.MyApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class InstallApiDemos {
	@Test
	public void installApiDemo() throws MalformedURLException {
	
		DesiredCapabilities desiredcapabilities=new DesiredCapabilities();
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredcapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		desiredcapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 API 30");
		desiredcapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Vamshi\\Downloads\\ApiDemosdebug.apk");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, desiredcapabilities);
		driver.installApp("C:\\Users\\Vamshi\\Downloads\\ApiDemos-debug.apk");
	
	
	}
}
