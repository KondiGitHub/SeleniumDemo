package com.TestingFrameWork.Pages;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.TestingFrameWork.Browsers.Browser;

public class Pages {

	public static ApplyPage applyPage() {
		return new ApplyPage();
	}
	
	public static ANLPage anlPage() {
		return new ANLPage();
	}
	
	public void submitForm(JSONObject formData)
	{
		
		getDriver().findElement(By.id("firstName")).sendKeys(formData.get("firstName").toString());
		getDriver().findElement(By.id("lastName")).sendKeys(formData.get("lastName").toString());
		getDriver().findElement(By.id("mailingAddress")).sendKeys(formData.get("streetAddress").toString());
		getDriver().findElement(By.id("applyVTO_applicantVO_zip_id")).sendKeys(formData.get("zipCode").toString());
		getDriver().findElement(By.id("applyVTO_applicantVO_city_id")).sendKeys(formData.get("cityAndState").toString());
		getDriver().findElement(By.id("appPrimaryPhone")).sendKeys(formData.get("primaryPhone").toString());
		getDriver().findElement(By.id("appPrimaryPhoneType")).sendKeys(formData.get("type").toString());
		getDriver().findElement(By.id("emailCheck")).sendKeys(formData.get("eamilAddress").toString());
		getDriver().findElement(By.id("appSSN")).sendKeys(formData.get("ssn").toString());
		getDriver().findElement(By.id("appDOB")).sendKeys(formData.get("dob").toString());
		getDriver().findElement(By.id("installmentsConfirmation")).click();
		getDriver().findElement(By.id("submitButton")).click();
	}
	
	public static WebDriver getDriver() {
		WebDriver driver = Browser.getDriver();
		return driver;
	}


		
	

}
