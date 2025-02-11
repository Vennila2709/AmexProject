package com.amex.tests;

import com.amex.base.BaseClass;
import com.amex.pages.*;

import junit.framework.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmexAutomationTest extends BaseClass {

	public HomePage homePage;
	public FRAllCardsPage frAllCardsPage;
	public GoldCardDescriptionPage goldDesPage;
	UserDetailsPage userPage;
	VosPage vos;

	@BeforeClass
	public void beforeClass() {
		launchBrowser();
		launchUrl("https://www.americanexpress.com/fr-fr/?inav=NavLogo");
	}

	@Test
	public void testAmexFlow() throws InterruptedException {
		homePage = new HomePage();
		// click on “Cartes American Express”
		homePage.clickAcceptButton();
		Assert.assertTrue("Home page is not displayed",homePage.homePageIsDispalyed());
		homePage.clickCartesEmericanExpressLink();
		// -> clicks on “En Savior Plus” Under “Cartes Gold American Express”
		frAllCardsPage = new FRAllCardsPage();
		Assert.assertTrue("FR All cards page is not displayed",frAllCardsPage.saviorPlusForGoldCartIsDispalyed());
		frAllCardsPage.clicksaviorPlusForGoldCart();
		// clicks on Demandez Votre Carte
		goldDesPage = new GoldCardDescriptionPage();
		Assert.assertTrue("Gold description page is not displayed",goldDesPage.demandezVotreCarteButtonIsDispalyed());
		goldDesPage.clickDemandezVotreCarteButton();
		// -> Fill junk data -> Clicks on “Sauvegarder et Continuer” for basic user
		// validations
		userPage = new UserDetailsPage();
		Assert.assertTrue("UserDetails page is not displayed",userPage.userDetilsFieldsIsDispalyed());
		userPage.fillUserDetails();
		userPage.clickContinueButton();
		vos = new VosPage();
		Assert.assertTrue("Continue button is not clicked",vos.vosInformationPageTitleDisplayed());

	}

	@AfterClass
	public void afterClass() {
		BaseClass.tearDown();
	}
}
