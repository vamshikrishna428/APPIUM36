package com.Mobile.MyApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class DragAndDrop {
	@Test
	public void dragAndDrop() throws MalformedURLException, InterruptedException {
		DesiredCapabilities desiredcapabilities=new DesiredCapabilities();
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredcapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		desiredcapabilities.setCapability("appPackage", "io.appium.android.apis");
		desiredcapabilities.setCapability("appActivity", ".ApiDemos");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, desiredcapabilities);
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
		MobileElement src = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
		MobileElement dst = (MobileElement) driver.findElement(By.id("io.appium.android.apis:id/drag_dot_3"));
/*		TouchAction touchaction=new TouchAction(driver);
		touchaction.longPress(src).waitAction().moveTo(dst).release().perform();	
		
		AndroidTouchAction finger1= new AndroidTouchAction(driver);
		
		finger1.longPress(LongPressOptions.longPressOptions().withElement(src.element(dst))).moveTo(PointOption.point(src,dst)).release().perform();	*/
		
		TouchAction action=new TouchAction((PerformsTouchActions)driver);
		action.longPress(ElementOption.element(src)).moveTo(ElementOption.element(dst)).release().perform();

		
	}
}
