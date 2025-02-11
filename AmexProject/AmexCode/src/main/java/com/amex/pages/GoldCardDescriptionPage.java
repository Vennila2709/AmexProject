package com.amex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amex.base.BaseClass;

public class GoldCardDescriptionPage extends BaseClass{

	WebDriver driver = BaseClass.driver;

	public WebElement demandezVotreCarteButton  = driver.findElement(By.xpath("//div[@class='sc_paddingTop_20 sc_paddingBottom_20']//a[@class='sc_at_button_btn sc_at_button_isMinMax sc_textBody_3 sc_horizontallyFluid'][normalize-space()='Demandez votre Carte']"));
	


	public boolean demandezVotreCarteButtonIsDispalyed() {
		return isDisplayed(demandezVotreCarteButton);
	}

	public void clickDemandezVotreCarteButton() {
		click(demandezVotreCarteButton);
	}
	
}
