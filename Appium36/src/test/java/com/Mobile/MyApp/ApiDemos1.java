package com.Mobile.MyApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemos1 {
	@Test
	public void apiDemos1() throws MalformedURLException, InterruptedException {
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
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]")).click();
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("vamshi");
		driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
		driver.findElement(By.id("io.appium.android.apis:id/check2")).click();
		driver.findElement(By.id("io.appium.android.apis:id/radio1")).click();
		Thread.sleep(3000);
		driver.hideKeyboard();
		Thread.sleep(3000);
		driver.findElement(By.id("io.appium.android.apis:id/star")).click();
		driver.findElement(By.id("io.appium.android.apis:id/toggle1")).click();
		driver.findElement(By.id("io.appium.android.apis:id/toggle2")).click();
		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Earth']")).click();
		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
		 List<WebElement> text = driver.findElements(By.className("android.widget.CheckedTextView"));
		for(WebElement alltext:text) {
			System.out.println(alltext.getText());
		}
		
	}
}
