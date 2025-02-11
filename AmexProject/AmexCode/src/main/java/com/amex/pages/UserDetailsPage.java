package com.amex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amex.base.BaseClass;

public class UserDetailsPage extends BaseClass{

	WebDriver driver = BaseClass.driver;

	public WebElement prefixButton = driver.findElement(By.xpath("//label[@for='MR']"));
	public WebElement firstNametextBox = driver.findElement(By.xpath("//input[@id='fieldControl-input-firstName']"));
	public WebElement lastNametextBox = driver.findElement(By.xpath("//input[@id='fieldControl-input-lastName']"));
	public WebElement dateOfBirthtextBox = driver
			.findElement(By.xpath("//input[@id='fieldControl-input-dateOfBirth']"));
	public WebElement emailtextBox = driver.findElement(By.xpath("//input[@id='fieldControl-input-email']"));
	public WebElement mobileNotextBox = driver.findElement(By.xpath("//input[@id='fieldControl-input-mobilePhoneNumber']"));
	public WebElement continueButton = driver
			.findElement(By.xpath("//button[normalize-space()='Sauvegarder et Continuer']"));
	/*public WebElement nextPageTitle = driver
			.findElement(By.xpath("//h2[normalize-space()='Vos informations personnelles']"));*/
	

	public boolean userDetilsFieldsIsDispalyed() {
		boolean flag = isDisplayed(prefixButton);
		if(flag) {
			click(prefixButton);
		}
		return flag;

	}

	public void fillUserDetails() {
		sendKey(firstNametextBox,"testFirstName");
		sendKey(lastNametextBox,"testLastName");
		sendKey(dateOfBirthtextBox,"04/04/2005");
		sendKey(emailtextBox,"test@gmail.com");
		sendKey(mobileNotextBox,"0612345678");
		
	}

	public void clickContinueButton() {
		if(isDisplayed(continueButton)) {
			clickByJs(continueButton);
			waitFor(2000);
		}
		
	}
}
