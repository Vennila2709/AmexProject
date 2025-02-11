package com.amex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amex.base.BaseClass;

public class FRAllCardsPage extends BaseClass{

	WebDriver driver = BaseClass.driver;

	public WebElement saviorPlusForGoldCart = driver.findElement(By.xpath("//span[text()='En savoir plus']/parent::a[contains(@href,'gold')]"));
	


	public boolean saviorPlusForGoldCartIsDispalyed() {
		return isDisplayed(saviorPlusForGoldCart);
	}

	public void clicksaviorPlusForGoldCart() {
		click(saviorPlusForGoldCart);
	}

}
