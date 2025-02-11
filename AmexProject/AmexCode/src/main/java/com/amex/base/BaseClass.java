package com.amex.base;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	

	public static void launchBrowser() {
		try {
		WebDriverManager.chromedriver().browserVersion("132").setup();
		// Disable WebSockets & DevTools Issues
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-debugging-port=9222");
		options.addArguments("--disable-blink-features=BlockCredentialedSubresources"); 
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void launchUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void tearDown() {
		try {
			if (driver != null) {
				driver.quit();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static boolean isDisplayed(WebElement element) {
		boolean flag = false;
		try {
			flag = element.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void sendKey(WebElement element, String text) {
		try {
			element.sendKeys(text);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void clickByJs(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void waitFor(int sec) {
		try {
			Thread.sleep(sec);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	
}