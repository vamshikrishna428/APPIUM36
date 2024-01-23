package com.Mobile.MyApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParallelExecutionTest {
	@Parameters({"deviceId","port"})
	@Test
	public void parallelExecutionTest(String deviceId,String port) throws MalformedURLException {
		DesiredCapabilities desiredcapabilites=new DesiredCapabilities();
		desiredcapabilites.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredcapabilites.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredcapabilites.setCapability(MobileCapabilityType.UDID, deviceId);
		desiredcapabilites.setCapability("appPackage", "com.androidsample.generalstore");
		desiredcapabilites.setCapability("appActivity", ".SplashActivity");
		
		URL url=new URL("http://localhost:"+port+"/wd/hub");
		AndroidDriver driver =new AndroidDriver(url, desiredcapabilites);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("vamshi");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		
	
	
	
	
	
	}
}
