package com.appium.MobileUtility;
	import java.io.File;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.remote.MobileCapabilityType;
	import io.appium.java_client.service.local.AppiumDriverLocalService;
	import io.appium.java_client.service.local.AppiumServiceBuilder;
	import io.appium.java_client.service.local.flags.GeneralServerFlag;

	public class StartServer {

		public static void main(String[] args) throws MalformedURLException, InterruptedException {
	    /* AppiumDriverLocalService server=AppiumDriverLocalService.buildDefaultService();
	     server.start();
	     
	     AppiumDriverLocalService server1=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
	    		 .withArgument(GeneralServerFlag.SESSION_OVERRIDE).usingPort(4723)
	    		 .withLogFile(new File("../AppiumSDET17/Logs.txt")));
	     server1.start();
	     
	     */
	     DesiredCapabilities capabilities=new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
			capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			capabilities.setCapability("appPackage","com.davemorrissey.labs.subscaleview.sample");
			capabilities.setCapability("appActivity", ".MainActivity");
			
			URL url=new URL("http://localhost:4723/wd/hub");
			AndroidDriver driver=new AndroidDriver(url,capabilities);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
			driver.findElement(By.id("android:id/button1")).click();
			driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
			MobileElement image = (MobileElement)driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
			
			driver.zoom(image);
			Thread.sleep(3000);
			driver.pinch(image);
			Thread.sleep(3000);
			driver.pinch(image);
		}

	}

