package com.TestingFrameWork.Pages;

import org.openqa.selenium.By;

public class ANLPage extends Pages {
	
	public  boolean isSSNTextBoxfound() {
		 if (getDriver().findElement(By.id("appSSN"))!=null) {
			 return true;
		 }
		 return false;
	}
	
	public   boolean iZipCodeTextBoxfound() {
		 if (getDriver().findElement(By.id("applyVTO_applicantVO_zip_id"))!=null) {
			 return true;
		 }
		 return false;
	}
	
	public void enterSSNAndZipcode(Integer ssn, Integer zipCode) {
		getDriver().findElement(By.id("appSSN")).sendKeys(ssn.toString());
		getDriver().findElement(By.id("applyVTO_applicantVO_zip_id")).sendKeys(zipCode.toString());
	}
	
	public void clickOnContinueButton(String buttonText) {
		getDriver().findElement(By.id("termSubmitButton")).click();
	}

}

