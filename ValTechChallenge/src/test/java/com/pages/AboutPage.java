package com.pages;

import org.openqa.selenium.By;

import com.cucumberRunner.BaseClass;

public class AboutPage extends BaseClass {
	private static By PAGE_NAME=By.cssSelector("h1");
	public String isAboutPageDisplayed(){
		return driver.findElement(PAGE_NAME).getText();
	}
public void selectValTechOfficeOption(){
	driver.findElement(By.linkText("Valtech Offices")).click();
	
}
public int countValTechOffices(){
	return driver.findElements(By.cssSelector(".office__header")).size();
}
}