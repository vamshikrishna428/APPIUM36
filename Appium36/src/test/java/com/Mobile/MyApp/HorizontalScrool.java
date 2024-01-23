package com.Mobile.MyApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class HorizontalScrool {
	@Test
	public void scroolDemo() throws MalformedURLException, InterruptedException {
		DesiredCapabilities desiredcapabilities=new DesiredCapabilities();
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredcapabilities.setCapability(MobileCapabilityType.UDID, "bfc40e93");
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
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/list\")).getChildByText(new UiSelector().className(\"android.widget.TextView\"),\"Tabs\")").click();
//		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"5. Scrollable\"]")).click();
		driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"Scrollable\")").click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/tabs\")).setAsHorizontalList().getChildByText(new UiSelector().className(\"android.widget.TextView\"),\"TAB 20\")").click();
		String text = driver.findElementByAndroidUIAutomator("new UiSelector().textMatches(\".*tag Tab 20\")").getText();
		System.out.println(text);
		
		
		
	}
}


/*

public static MobileElement scrollElementByContentDesc(String scrollableList, String uiSelector, String textToSearchInList) {
return driver.findElement(MobileBy.AndroidUIAutomator(
        "new UiScrollable(new UiSelector().resourceId(\"" + scrollableList + "\")).getChildByDescription("
                + "new UiSelector().className(\"" + uiSelector + "\"), \"" + textToSearchInList+ "\")"));

}

*/