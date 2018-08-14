package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumberRunner.BaseClass;

public class UtilityPage extends BaseClass{
	public void waitForElementDisplay(By element,int index) {
		WebDriverWait wait = new WebDriverWait(driver, index);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	

}
