package com.pages;

import org.openqa.selenium.By;

import com.cucumberRunner.BaseClass;

public class ServicesPage extends BaseClass {
	private static By PAGE_NAME=By.cssSelector("h1");
	public String isServicesPageDisplayed(){
		return driver.findElement(PAGE_NAME).getText();
	}

}