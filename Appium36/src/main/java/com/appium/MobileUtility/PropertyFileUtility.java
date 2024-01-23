package com.appium.MobileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {

	private Properties property;

	/**THIS METHOD IS USED FOR INTIALIZE THE PROPERTY FILE
	 * 
	 * @param propertypath
	 */
	public void initializePropertyFile(String propertypath) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		property=new Properties();
		try {
			property.load(fis);
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	/**
	 * this method is used to fetch the data from property file
	 * @param key
	 */

	public String getpropertyData(String key) {
	return	property.getProperty(key);
	}
}
