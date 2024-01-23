package com.Mobile.MyApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwipeActionsOnTouchScreen {
	@Test
	public void swipeActionsOnTouchScreen() throws MalformedURLException {
		DesiredCapabilities desiredcapabilities= new DesiredCapabilities();
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredcapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		desiredcapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Vamshi\\Downloads\\TouchScreenTest_v1.7.14_apkpure.com.apk");
		desiredcapabilities.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		desiredcapabilities.setCapability("appActivity", ".TouchScreenTestActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, desiredcapabilities);
		driver.swipe(296, 255, 292, 901, 500);
		driver.swipe(69, 543, 936, 548, 500);
		Dimension size = driver.manage().window().getSize();
		int width = size.getWidth();
		int height = size.getHeight();
		
		driver.swipe(width/2, height, width/2, height, 500);
		driver.swipe(height/2, width, height/2, width, 500);
		System.out.println("height of the phone is"+height);
		
		System.out.println("width of the phone is"+width);
		//vertical swipe
		driver.swipe(width/2,(int)(height*0.25), width/2,(int)(height*0.80), 1000);
		driver.swipe((int)(width*0.1),(int)(height*0.2),(int)(width*0.1),(int)(height*0.8), 500);
		driver.swipe((int)(width*0.5),(int)(height*0.2),(int)(width*0.5),(int)(height*0.8), 500);
		driver.swipe((int)(width*0.9),(int)(height*0.2),(int)(width*0.9),(int)(height*0.8), 500);
		//horizontal swipe
		driver.swipe((int)(width*0.25),height/2,(int) (width*0.80),height/2,1000);
		driver.swipe((int)(width*0.1),(int)(height*0.2),(int)(width*0.9),(int)(height*0.8), 500);
		driver.swipe((int)(width*0.1),(int)(height*0.2),(int)(width*0.9),(int)(height*0.2), 500);
		driver.swipe((int)(width*0.1),(int)(height*0.2),(int)(width*0.9),(int)(height*0.5), 500);
		
	}
}
