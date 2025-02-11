package com.amex.pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amex.base.BaseClass;

/**
 * Hello world!
 *
 */
public class HomePage extends BaseClass {

	WebDriver driver = BaseClass.driver;

	public By acceptButton = By.xpath("//button[contains(@data-testid, 'accept')]");
	public By acceptPopup = By.xpath("//div[@class='granular-banner-wrapper']");
	public WebElement connexionTabInHomePage = driver.findElement(By.xpath("//span[normalize-space()='Connexion']"));
	public WebElement cartesEmericanExpressLink = driver
			.findElement(By.xpath("//p[text()='Cartes American Express®']"));

	public boolean homePageIsDispalyed() {
		boolean flag = isDisplayed(connexionTabInHomePage);
		return flag;

	}

	public void clickCartesEmericanExpressLink() {
		try {
			if(isDisplayed(cartesEmericanExpressLink)) {
				cartesEmericanExpressLink.click();
			}	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void clickAcceptButton() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
			// Wait for the popup to appear
			WebElement popup = wait.until(ExpectedConditions.presenceOfElementLocated(acceptPopup));
			if(isDisplayed(popup)) {
			System.out.println("Popup appeared!");
			}
			// Now wait for an element inside the popup
			WebElement acceptBtn = wait.until(ExpectedConditions.elementToBeClickable(acceptButton));
			click(acceptBtn);
			waitFor(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
