package com.appium.MobileUtility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	AppiumDriverLocalService server;
	AndroidDriver driver;

	@BeforeSuite
	public void database() {
		System.out.println("open database");
	}
	@BeforeClass
	public void startServer() {
		server=AppiumDriverLocalService.buildDefaultService();
		server.start();
	}
	@BeforeMethod
	public void openApp() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");

		URL url=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url,dc);
	}
	@AfterMethod
	public void closeApp() {
		driver.closeApp();

	}
	@AfterClass
	public void stopServer() {
		server.stop();
	}
}



