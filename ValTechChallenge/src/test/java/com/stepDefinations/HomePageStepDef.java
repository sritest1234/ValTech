package com.stepDefinations;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumberRunner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
public class HomePageStepDef extends BaseClass{
	String BASEURL="https://www.valtech.com/";
	@Given("^I am in home page$")
    public void i_am_in_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver");
		driver=new ChromeDriver();
		driver.get(BASEURL);
		driver.manage().window().fullscreen();
		
       homePage.acceptCookieIfDisplayed();
       driver.navigate().refresh();
    }

    @Then("^I should see \"([^\"]*)\" section should be disply$")
    public void i_should_see_something_section_should_be_disply(String expectedSection) throws Throwable {
    	assertThat("Latest Section is not present"+"Actual:"+homePage.getLatestNewsSectionText(), homePage.getLatestNewsSectionText().equalsIgnoreCase(expectedSection));
    }
    
    @When("^I select \"([^\"]*)\" from Top Nav$")
    public void i_select_something_from_top_nav(String topNavItemName) throws Throwable {
       homePage.selectTopNavItem(topNavItemName);
    }

   

}