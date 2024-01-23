package com.Mobile.MyApp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class CameraActions {
	@Test
	public void cameraActions() throws MalformedURLException, InterruptedException
{
		DesiredCapabilities desiredcapabilities= new DesiredCapabilities();
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredcapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredcapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		//desiredcapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Vamshi\\Downloads\\TouchScreenTest_v1.7.14_apkpure.com.apk");
		desiredcapabilities.setCapability("appPackage", "com.oppo.camera");
		desiredcapabilities.setCapability("appActivity", ".Camera");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, desiredcapabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
/*		System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
		System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_UP);
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_MUTE);
		System.out.println(AndroidKeyCode.KEYCODE_BACK);
		
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
		Thread.sleep(3000);
		driver.openNotifications();
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
		Thread.sleep(3000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
		driver.close();
	*/	
		driver.pressKey(new KeyEvent(AndroidKey.BRIGHTNESS_DOWN));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.CAMERA));	//not working
		
		
		
		
		
		
}
}
