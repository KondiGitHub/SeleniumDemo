
package com.TestingFrameWork.Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	static WebDriver driver = new FirefoxDriver();
	
	public static void goTo(String url) {
		driver.get(url);
		
	}

	public static Object title() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	
	public static void close() {
		driver.close();
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
