package com.Practise.Appium;

import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumServer {
	@Test
	public void appiumServer() {
		AppiumDriverLocalService Service = new AppiumServiceBuilder().usingPort(4725).build();
			
		
		String url = Service.getUrl().toString();
		
		
		System.out.println("url address :" +url);
		System.out.println("Appium Service Address : - " + Service);
		
//		Service.start();
		Service.stop();
		
		
		
	}
}

