package com.cucumberRunner;

import org.openqa.selenium.WebDriver;

import com.pages.AboutPage;
import com.pages.HomePage;
import com.pages.ServicesPage;
import com.pages.UtilityPage;
import com.pages.WorkPage;

public class BaseClass {
	
	public static WebDriver driver;
	public static HomePage homePage=new HomePage();
	public static AboutPage aboutPage=new AboutPage();
	public static ServicesPage servicesPage =new ServicesPage();
	public static WorkPage workPage=new WorkPage();
	public static UtilityPage utilityPage=new UtilityPage();
	
	

}
