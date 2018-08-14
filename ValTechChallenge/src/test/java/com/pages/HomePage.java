package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.cucumberRunner.BaseClass;

public class HomePage extends BaseClass{
// There is no latest section available in the page Hence if you find latest section CSS we can add here
	private static final By LATEST_NEWS_SECTION=By.cssSelector(".SomeHeadingClass");
	private static final By COOKIE_SECTION=By.cssSelector(".cookie__action a");
	private static By topNavItem(String topNavItemName) {

		return By.xpath("//a[contains(text(),'"+topNavItemName+"')]");
	}
	public String getLatestNewsSectionText(){
	 return	driver.findElements(LATEST_NEWS_SECTION).get(2).getText();
		
	}
	public void selectTopNavItem(String topNavItemName) throws InterruptedException{
		utilityPage.waitForElementDisplay(topNavItem(topNavItemName),10);
		JavascriptExecutor js = (JavascriptExecutor) driver;           		
        WebElement Element = driver.findElement(topNavItem(topNavItemName));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        utilityPage.waitForElementDisplay(topNavItem(topNavItemName),10);
		driver.findElement(topNavItem(topNavItemName)).click();
		
	}
	public void acceptCookieIfDisplayed() { 
		if(driver.findElement(COOKIE_SECTION).isDisplayed()) {
			driver.findElement(COOKIE_SECTION).click();
		}
	}

}
