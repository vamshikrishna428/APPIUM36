package com.Mobile.MyApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.appium.Pomclasses.ScaleViewAppPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class ZoomInZoomOut1 {
	@Test
	public void zoomInZoomOut1() throws MalformedURLException, InterruptedException {
	/*	AppiumDriverLocalService server=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
				.usingPort(4723)
				.withLogFile(new File(" ")));	
		
		server.start();	*/
		DesiredCapabilities desiredcapabilities=new DesiredCapabilities();
	/*	desiredcapabilities.setCapability("platformName", "Android");
		desiredcapabilities.setCapability("automationName","Appium");
		desiredcapabilities.setCapability("platformVersion", "11");
		desiredcapabilities.setCapability("deviceId", "emulator-5554");	*/
		
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredcapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		
		desiredcapabilities.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		desiredcapabilities.setCapability("appActivity", ".MainActivity");
		desiredcapabilities.setCapability("noReset", true);
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, desiredcapabilities);

//		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
//		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(3000);
//		driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
		ScaleViewAppPage scaleviewapp=new ScaleViewAppPage(driver);
		scaleviewapp.getBasicfeatures();
		Thread.sleep(3000);
		MobileElement img = scaleviewapp.getImage();
//		WebElement img = driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
		driver.zoom(img);
		Thread.sleep(3000);
		driver.pinch(img);
		
		
		
	}
}
