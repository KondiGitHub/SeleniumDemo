package com.TestingFrameWork.Pages;

import org.json.JSONObject;
import org.openqa.selenium.By;

import com.TestingFrameWork.Browsers.Browser;

import dataReader.DataReader;

public class ApplyPage extends Pages {

	static String url ="url";
	static String title ="title";
	
	public void goTo() {
		Browser.goTo(url);
	}
	
	public boolean isAt() {
		
		return Browser.title().equals(title);
	}
	
	public void enterFormData(String dataType) {
		DataReader dataReader = new DataReader();
		if (dataType.equals("TierA")) {
			JSONObject json = dataReader.readTestData();
			System.out.println("json is"+json);
			submitForm(json);
		}
	}
	
	public void clickOnCheckApplicationStatusLink(String linkText) {
		getDriver().findElement(By.linkText(linkText)).click();;
	}

}
