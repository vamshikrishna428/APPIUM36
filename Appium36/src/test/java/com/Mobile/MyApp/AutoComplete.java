package com.Mobile.MyApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class AutoComplete {
	@Test
	public void autoComplete() throws MalformedURLException, InterruptedException {
	DesiredCapabilities desiredcapabilities=new DesiredCapabilities();
	desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	desiredcapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
	desiredcapabilities.setCapability("appPackage", "io.appium.android.apis");
	desiredcapabilities.setCapability("appActivity", ".ApiDemos");
	
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url, desiredcapabilities);
	driver.launchApp();
	boolean value = driver.isAppInstalled("io.appium.android.apis");
	System.out.println(value);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
	driver.findElement(By.id("android:id/button1")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
	driver.findElement(MobileBy.AccessibilityId("Auto Complete")).click();
//	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Scroll\"]")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Screen Top\"]")).click();
	driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("united");
	
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	Thread.sleep(3000);
	driver.pressKey(new KeyEvent(AndroidKey.DEL));
	Thread.sleep(3000);
	driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	Thread.sleep(3000);
	driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	Thread.sleep(3000);
	driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
	Thread.sleep(3000);
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	
	
	driver.pressKey(new KeyEvent(AndroidKey.BRIGHTNESS_DOWN));
}
}
