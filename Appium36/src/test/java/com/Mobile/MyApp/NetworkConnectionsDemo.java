package com.Mobile.MyApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class NetworkConnectionsDemo {
	@Test
	public void networkConnectios() throws MalformedURLException, InterruptedException {
		DesiredCapabilities desiredcapabilities=new  DesiredCapabilities();
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredcapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		desiredcapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 API 30");
		URL url=new URL("http:localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, desiredcapabilities);
		
		
//		 ConnectionState connection = driver.getConnection();
		
//		driver.setConnection(Connection.DATA);		
//		driver.setConnection(Connection.AIRPLANE);
//		driver.setLocation(ConnectionState.WIFI_MASK);
//		 driver.toggleAirplaneMode();
//		 Thread.sleep(3000);
//		 driver.toggleData();
//		 Thread.sleep(3000);
//		 driver.toggleLocationServices();
//		 Thread.sleep(3000);	
		 driver.toggleWifi();
//		((AndroidDriver) driver).toggleWifi();
		 
		 
	}
}
