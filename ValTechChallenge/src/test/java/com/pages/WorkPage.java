package com.pages;

import org.openqa.selenium.By;

import com.cucumberRunner.BaseClass;

public class WorkPage extends BaseClass {
	private static By PAGE_NAME=By.cssSelector("h1");
	public String isWorkPageDisplayed(){
		return driver.findElement(PAGE_NAME).getText();
	}

}