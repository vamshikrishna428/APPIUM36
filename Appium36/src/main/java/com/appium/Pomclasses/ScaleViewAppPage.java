package com.appium.Pomclasses;

import java.lang.reflect.Field;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ScaleViewAppPage {

	public ScaleViewAppPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")
	private MobileElement basicfeatures;

	@AndroidFindBy(id = "com.davemorrissey.labs.subscaleview.sample:id/imageView")
	private MobileElement image;

	public void  getBasicfeatures() {
		basicfeatures.click();
	}
	public MobileElement getImage() {
		return image;
		
	}
}

















