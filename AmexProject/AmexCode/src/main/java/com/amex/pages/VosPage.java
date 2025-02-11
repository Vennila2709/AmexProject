package com.amex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amex.base.BaseClass;

public class VosPage extends BaseClass {
	WebDriver driver = BaseClass.driver;

	public WebElement vosInformationPageTitle = driver
			.findElement(By.xpath("//h2[normalize-space()='Vos informations personnelles']"));

	public boolean vosInformationPageTitleDisplayed() {
		return isDisplayed(vosInformationPageTitle);
	}

}
